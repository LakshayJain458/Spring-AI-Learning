package org.example.spring_ai.service.Impls;

import org.example.spring_ai.service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.document.Document;
import org.springframework.ai.rag.advisor.RetrievalAugmentationAdvisor;
import org.springframework.ai.rag.generation.augmentation.ContextualQueryAugmenter;
import org.springframework.ai.rag.preretrieval.query.expansion.MultiQueryExpander;
import org.springframework.ai.rag.preretrieval.query.transformation.RewriteQueryTransformer;
import org.springframework.ai.rag.preretrieval.query.transformation.TranslationQueryTransformer;
import org.springframework.ai.rag.retrieval.join.ConcatenationDocumentJoiner;
import org.springframework.ai.rag.retrieval.search.VectorStoreDocumentRetriever;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    private Logger logger = LoggerFactory.getLogger(ChatServiceImpl.class);

    @Value("classpath:system-prompt.st")
    private Resource systemPromptResource;

    private final VectorStore vectorStore;

    private final ChatClient chatClient;

    public ChatServiceImpl(ChatClient chatClient, VectorStore vectorStore) {
        this.chatClient = chatClient;
        this.vectorStore = vectorStore;
    }


    @Override
    public String getResponse(String query) {
        var customAdvisor = RetrievalAugmentationAdvisor.builder()
                //Pre Retrieval
                .queryTransformers(
                        RewriteQueryTransformer.builder()
                                .chatClientBuilder(chatClient.mutate().clone())
                                .build(),
                        TranslationQueryTransformer.builder()
                                .chatClientBuilder(chatClient.mutate().clone())
                                .targetLanguage("English")
                                .build()
//                        CompressionQueryTransformer.builder()
//                                .chatClientBuilder(chatClient.mutate().clone())
//                                .build()
                )
                .queryExpander(MultiQueryExpander.builder()
                        .chatClientBuilder(chatClient.mutate().clone())
                        .numberOfQueries(3)
                        .build()
                )
                //Retrieval
                .documentRetriever(
                        VectorStoreDocumentRetriever.builder()
                                .vectorStore(vectorStore)
                                .topK(4)
                                .similarityThreshold(0.6)
                                .build()
                )
                .documentJoiner(new ConcatenationDocumentJoiner())

                //Post-retrieval
//              .documentPostProcessors()

                //Generation
                .queryAugmenter(ContextualQueryAugmenter.builder()
                        .allowEmptyContext(true)
                        .build())
                .build();

        return chatClient.prompt()
                .advisors(customAdvisor)
                .user(query)
                .system(systemPromptResource)
                .call()
                .content();
    }

    @Override
    public void saveData(List<String> data) {
        List<Document> documents = data.stream().map(Document::new).toList();
        vectorStore.add(documents);
    }
}
