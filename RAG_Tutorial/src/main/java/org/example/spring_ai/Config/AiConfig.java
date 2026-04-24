package org.example.spring_ai.Config;

import org.example.spring_ai.advisors.TokenPrintAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SafeGuardAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemoryRepository;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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

//    @Bean
//    public ChatMemory chatMemory(JdbcChatMemoryRepository jdbcChatMemoryRepository) {
//        return MessageWindowChatMemory.builder()
//                .chatMemoryRepository(jdbcChatMemoryRepository)
//                .maxMessages(10)
//                .build();
//    }

    @Bean
    public ChatMemory chatMemory() {
        InMemoryChatMemoryRepository repository = new InMemoryChatMemoryRepository();
        return MessageWindowChatMemory.builder()
                .chatMemoryRepository(repository)
                .maxMessages(10)
                .build();
    }

    @Bean(name = "ollamaChatClient")
    @ConditionalOnProperty(prefix = "app.ai.ollama", name = "enabled", havingValue = "true", matchIfMissing = true)
    public ChatClient ollamaChatClient(OllamaChatModel chatModel, ChatMemory chatMemory) {

        MessageChatMemoryAdvisor messageChatMemoryAdvisor = MessageChatMemoryAdvisor.builder(chatMemory).build();

        return ChatClient.builder(chatModel)
                .defaultAdvisors(messageChatMemoryAdvisor, new TokenPrintAdvisor(), new SafeGuardAdvisor(BLOCKED_TOPICS))
                .defaultOptions(OllamaOptions.builder()
                        .temperature(0.7)
                        .build())
                .build();
    }

    @Bean(name = "openRouterChatClient")
    @ConditionalOnProperty(prefix = "app.ai.openrouter", name = "enabled", havingValue = "true")
    public ChatClient openRouterChatClient(OpenAiChatModel chatModel, ChatMemory chatMemory) {

        MessageChatMemoryAdvisor messageChatMemoryAdvisor = MessageChatMemoryAdvisor.builder(chatMemory).build();

        return ChatClient.builder(chatModel)
                .defaultAdvisors(messageChatMemoryAdvisor, new TokenPrintAdvisor(), new SimpleLoggerAdvisor(), new SafeGuardAdvisor(BLOCKED_TOPICS))
                .defaultOptions(OpenAiChatOptions.builder()
                        .temperature(0.3)
                        .maxTokens(300)
                        .build())
                .build();
    }
}
