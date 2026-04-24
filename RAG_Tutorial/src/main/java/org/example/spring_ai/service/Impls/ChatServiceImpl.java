package org.example.spring_ai.service.Impls;

import org.example.spring_ai.service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.document.Document;
import org.springframework.ai.rag.advisor.RetrievalAugmentationAdvisor;
import org.springframework.ai.rag.generation.augmentation.ContextualQueryAugmenter;
import org.springframework.ai.rag.retrieval.search.VectorStoreDocumentRetriever;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {
    @Value("classpath:system-prompt.st")
    private Resource systemPromptResource;
    private final Optional<ChatClient> ollamaChatClient;
    private final Optional<ChatClient> openRouterChatClient;
    private final String defaultProvider;
    private VectorStore vectorStore;
    Logger logger = LoggerFactory.getLogger(ChatServiceImpl.class);

    public ChatServiceImpl(
            @Qualifier("ollamaChatClient") Optional<ChatClient> ollamaChatClient,
            @Qualifier("openRouterChatClient") Optional<ChatClient> openRouterChatClient,
            @Value("${app.ai.default-provider:ollama}") String defaultProvider,
            VectorStore vectorStore) {
        this.ollamaChatClient = ollamaChatClient;
        this.openRouterChatClient = openRouterChatClient;
        this.defaultProvider = normalizeProvider(defaultProvider);
        this.vectorStore = vectorStore;
    }

    @Override
    public String chat(String query) {
        return chat(query, null);
    }

    @Override
    public String chat(String query, String provider) {

//        Instead of this whole extra code we can use questionAdvisor in the return statement to perform all these actions
//        SearchRequest searchRequest = SearchRequest.builder()
//                .topK(3)
//                .query(query)
//                .similarityThreshold(0.6)
//                .build();
//        List<Document> documents = this.vectorStore.similaritySearch(searchRequest);
//        List<String> documentList = documents.stream().map(Document::getText).toList();
//        String context = String.join("\n\n ", documentList);
//        logger.info("context is {}", context);

        //Similarly we can use retrieval augmentation advisor for this , but It is more powerful as it provides an out-of-box implementation of advanced RAG modules
        var customAdvisor = RetrievalAugmentationAdvisor.builder()
                .documentRetriever(VectorStoreDocumentRetriever.builder()
                        .similarityThreshold(0.6)
                        .topK(4)
                        .vectorStore(vectorStore)
                        .build())
                .queryAugmenter(ContextualQueryAugmenter.builder()
                        .allowEmptyContext(true)
                        .build())
                .build();

        return selectClient(provider)
                .prompt()

//                .advisors(new QuestionAnswerAdvisor(vectorStore))
               // OR
//                .advisors(QuestionAnswerAdvisor.builder(vectorStore)
//                        .searchRequest(SearchRequest.builder()
//                                .topK(4)
//                                .similarityThreshold(0.6)
//                                .build())
//                        .build())

                .advisors(customAdvisor)
                .user(query)
//                .system(sp -> sp.text(systemPromptResource).param("context", context))
                .call()
                .content();
    }

    @Override
    public String chat(String query, String provider, String userId) {
        return selectClient(provider)
                .prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, userId))
                .user(query)
                .system(sp -> sp.text(systemPromptResource))
                .call()
                .content();
    }

    @Override
    public List<String> availableProviders() {
        List<String> providers = new ArrayList<>();
        if (ollamaChatClient.isPresent()) providers.add("ollama");
        if (openRouterChatClient.isPresent()) providers.add("openrouter");
        return List.copyOf(providers);
    }

    @Override
    public Flux<String> streamChat(String query, String provider) {
        return selectClient(provider)
                .prompt()
                .user(query)
                .system(sp -> sp.text(systemPromptResource))
                .stream()
                .content();
    }

    @Override
    public void saveData(List<String> data) {
        List<Document> documents = data.stream().map(Document::new).toList();
        vectorStore.add(documents);
    }

    private ChatClient selectClient(String provider) {
        return switch (resolveProvider(provider)) {
            case "ollama" -> ollamaChatClient.orElseThrow(() ->
                    new IllegalArgumentException("Ollama is not enabled. Set app.ai.ollama.enabled=true in application.properties."));
            case "openrouter" -> openRouterChatClient.orElseThrow(() ->
                    new IllegalArgumentException("OpenRouter is not enabled. Set app.ai.openrouter.enabled=true and provide OPENROUTER_API_KEY."));
            default -> throw new IllegalArgumentException("Unsupported provider.");
        };
    }

    private String resolveProvider(String provider) {
        String selected = normalizeProvider(provider == null || provider.isBlank() ? defaultProvider : provider);
        if (!selected.equals("ollama") && !selected.equals("openrouter")) {
            throw new IllegalArgumentException(
                    "Unsupported provider '%s'. Use 'ollama' or 'openrouter'.".formatted(provider));
        }
        return selected;
    }

    private String normalizeProvider(String provider) {
        return provider == null ? "ollama" : provider.trim().toLowerCase(Locale.ROOT).replace("-", "").replace("_", "");
    }
}
