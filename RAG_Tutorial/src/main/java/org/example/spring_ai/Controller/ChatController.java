package org.example.spring_ai.Controller;

import org.example.spring_ai.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat/providers")
    public ResponseEntity<java.util.List<String>> availableProviders() {
        return ResponseEntity.ok(chatService.availableProviders());
    }

    // For many users
//    @GetMapping("/chat")
//    public ResponseEntity<String> chat(
//            @RequestParam("q") String query,
//            @RequestParam(value = "provider", required = false) String provider,
//            @RequestHeader("userId") String userId
//    ) {
//        try {
//            var response = chatService.chat(query, provider, userId);
//            return ResponseEntity.ok(response);
//        } catch (IllegalArgumentException exception) {
//            return ResponseEntity.badRequest().body(exception.getMessage());
//        }
//    }

    //Normal chat with conversation storage , but not for many user , same default conversation Id
    @GetMapping("/chat")
    public ResponseEntity<String> chat(
            @RequestParam("q") String query,
            @RequestParam(value = "provider", required = false) String provider
    ) {
        try {
            var response = chatService.chat(query, provider);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/stream-chat")
    public ResponseEntity<Flux<String>> streamChat(
            @RequestParam("q") String query,
            @RequestParam(value = "provider", required = false) String provider) {
        try {
            var response = chatService.streamChat(query, provider);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.badRequest().body(Flux.just(exception.getMessage()));
        }
    }
}
