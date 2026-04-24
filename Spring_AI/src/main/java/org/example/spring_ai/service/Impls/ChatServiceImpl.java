package org.example.spring_ai.service.Impls;

import org.example.spring_ai.service.ChatService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {
    private static final String SYSTEM_PROMPT = "You are a helpful assistant.";

    private final Optional<ChatClient> ollamaChatClient;
    private final Optional<ChatClient> openRouterChatClient;
    private final String defaultProvider;

    public ChatServiceImpl(
            @Qualifier("ollamaChatClient") Optional<ChatClient> ollamaChatClient,
            @Qualifier("openRouterChatClient") Optional<ChatClient> openRouterChatClient,
            @Value("${app.ai.default-provider:ollama}") String defaultProvider) {
        this.ollamaChatClient = ollamaChatClient;
        this.openRouterChatClient = openRouterChatClient;
        this.defaultProvider = normalizeProvider(defaultProvider);
    }

    @Override
    public String chat(String query) {
        return chat(query, null);
    }

    @Override
    public String chat(String query, String provider) {
        return selectClient(provider)
                .prompt()
                .user(query)
                .system(SYSTEM_PROMPT)
                .call()
                .content();
    }

    @Override
    public String chat(String query, String provider, String userId) {
        return selectClient(provider)
                .prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, userId))
                .user(query)
                .system(SYSTEM_PROMPT)
                .call()
                .content();
    }

    @Override
    public List<String> availableProviders() {
        List<String> providers = new ArrayList<>();
        if (ollamaChatClient.isPresent()) providers.add("ollama");
        if (openRouterChatClient.isPresent()) providers.add("openrouter");
        return List.copyOf(providers);
    }

    @Override
    public Flux<String> streamChat(String query, String provider) {
        return selectClient(provider)
                .prompt()
                .user(query)
                .system(SYSTEM_PROMPT)
                .stream()
                .content();
    }

    private ChatClient selectClient(String provider) {
        return switch (resolveProvider(provider)) {
            case "ollama" -> ollamaChatClient.orElseThrow(() ->
                    new IllegalArgumentException("Ollama is not enabled. Set app.ai.ollama.enabled=true in application.properties."));
            case "openrouter" -> openRouterChatClient.orElseThrow(() ->
                    new IllegalArgumentException("OpenRouter is not enabled. Set app.ai.openrouter.enabled=true and provide OPENROUTER_API_KEY."));
            default -> throw new IllegalArgumentException("Unsupported provider.");
        };
    }

    private String resolveProvider(String provider) {
        String selected = normalizeProvider(provider == null || provider.isBlank() ? defaultProvider : provider);
        if (!selected.equals("ollama") && !selected.equals("openrouter")) {
            throw new IllegalArgumentException(
                    "Unsupported provider '%s'. Use 'ollama' or 'openrouter'.".formatted(provider));
        }
        return selected;
    }

    private String normalizeProvider(String provider) {
        return provider == null ? "ollama" : provider.trim().toLowerCase(Locale.ROOT).replace("-", "").replace("_", "");
    }
}
