package org.example.spring_ai.Config;

import org.example.spring_ai.advisors.TokenPrintAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SafeGuardAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AiConfig {

    private static final List<String> BLOCKED_TOPICS = List.of(
            "inappropriate content",
            "hate speech",
            "violence"
    );

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {

        return builder
                .defaultAdvisors(new TokenPrintAdvisor(), new SimpleLoggerAdvisor(), new SafeGuardAdvisor(BLOCKED_TOPICS))
                .defaultOptions(OpenAiChatOptions.builder()
                        .temperature(0.3)
                        .maxTokens(300)
                        .build())
                .build();
    }
}
