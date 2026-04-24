package org.example.spring_ai.service;

import java.util.List;

public interface ChatService {
    String getResponse(String query);

    void saveData(List<String> data);
}
