package org.example.spring_ai.service.Impls;

import org.example.spring_ai.service.ChatService;
import org.example.spring_ai.tools.DateTimeTool;
import org.example.spring_ai.tools.weatherTool;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatClient chatClient;

    private final weatherTool weatherTool;

    private final DateTimeTool dateTimeTool;

    public ChatServiceImpl(ChatClient chatClient, weatherTool weatherTool, DateTimeTool dateTimeTool) {
        this.chatClient = chatClient;
        this.weatherTool = weatherTool;
        this.dateTimeTool = dateTimeTool;
    }

    @Override
    public String chat(String query) {
        return chatClient
                .prompt()
                .tools(weatherTool, dateTimeTool)
                .user(query)
                .call()
                .content();
    }
}
