package org.example.spring_ai.service;

import reactor.core.publisher.Flux;

import java.util.List;

public interface ChatService {
    String chat(String query);

    String chat(String query, String provider);

    List<String> availableProviders();

    Flux<String> streamChat(String query, String provider);

    //for many users
    String chat(String query, String provider, String userId);

    void saveData(List<String> data);
}
