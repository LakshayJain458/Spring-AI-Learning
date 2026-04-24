package com.backened.mcp_tutorial.Controller;

import com.backened.mcp_tutorial.service.ChatService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {

    private final ChatService chatService;

    public AIController(ChatService chatService) {
        this.chatService = chatService;

    }

    @PostMapping("/chat")
    public ResponseEntity<String> getAiResponse(
            @RequestParam("q") String query
    ) {
        String response = chatService.getResponse(query);
        return ResponseEntity.ok(response);
    }
}
