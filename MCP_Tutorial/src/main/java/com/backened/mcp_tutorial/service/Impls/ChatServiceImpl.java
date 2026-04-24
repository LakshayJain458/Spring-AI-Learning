package com.backened.mcp_tutorial.service.Impls;

import com.backened.mcp_tutorial.service.ChatService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatClient chatClient;

    public ChatServiceImpl(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String getResponse(String query) {
        return chatClient.prompt(query)
                .call()
                .content();
    }
}
