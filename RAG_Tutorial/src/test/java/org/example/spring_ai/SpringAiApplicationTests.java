package org.example.spring_ai;

import org.example.spring_ai.helper.Helper;
import org.example.spring_ai.service.ChatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ChatService  chatService;

    @Test
    void saveDataToVectorDb() {
        System.out.println("Saving documents to vector store...");
        this.chatService.saveData(Helper.getData());
        System.out.println("Documents saved successfully.");
    }

}
