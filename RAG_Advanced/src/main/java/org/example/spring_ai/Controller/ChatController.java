package org.example.spring_ai.Controller;

import org.example.spring_ai.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public ResponseEntity<String> getResponse(@RequestParam("q") String query) {
        return ResponseEntity.ok(chatService.getResponse(query));
    }

}
