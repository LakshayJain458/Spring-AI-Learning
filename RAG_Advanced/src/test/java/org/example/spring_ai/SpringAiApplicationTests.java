package org.example.spring_ai;

import org.example.spring_ai.helper.Helper;
import org.example.spring_ai.service.ChatService;
import org.example.spring_ai.service.DataLoaderService;
import org.example.spring_ai.service.DataTransformerService;
import org.junit.jupiter.api.Test;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringAiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ChatService chatService;

    @Test
    void saveDataToVectorDb() {
        System.out.println("Saving documents to vector store...");
        this.chatService.saveData(Helper.getData());
        System.out.println("Documents saved successfully.");
    }

    @Autowired
    private DataLoaderService dataLoaderService;

    @Autowired
    private DataTransformerService dataTransformerService;

    @Autowired
    private VectorStore vectorStore;

    @Test
    void testDataLoader() {
        var documents = dataLoaderService.loadDocumentsFromJson();
        IO.println(documents.size());
        documents.forEach(IO::println);
    }

    @Test
    void testPdfDataLoader() {
        var documents = dataLoaderService.loadDocumentsFromPdf();
        IO.println("Total documents: " + documents.size());
        IO.println("=".repeat(80));

        documents.forEach(doc -> {
            String formattedContent = doc.getFormattedContent()
                    .replaceAll("(?m)^(.+)$", "$1\n")   // add blank line after each line
                    .replaceAll("\n{3,}", "\n\n");        // collapse excess blank lines

            IO.println(formattedContent);
            IO.println("-".repeat(80));
        });

        IO.println("Now Transforming documents...");
        List<Document> transformedDocuments = dataTransformerService.transformDocuments(documents);
        IO.println(transformedDocuments.size());

//        IO.println("Saving documents to vector store...");
//        vectorStore.add(transformedDocuments);
//        IO.println("Documents saved successfully.");
    }

}
