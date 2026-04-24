package org.example.spring_ai.tools;

import org.slf4j.Logger;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Map;

@Service
public class weatherTool {

    private final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    private final RestClient restClient;

    public weatherTool(RestClient restClient) {
        this.restClient = restClient;
    }

    @Value("${app.weather.api-key}")
    private String weatherApiKey;

    @Tool(description = "Get the current weather information for a specific location.")
    public String getWeather(@ToolParam(description = "location for which we need the weather information") String location) {
        this.logger.info("Tool calling");
        this.logger.info("Getting the weather information for a specific location.");
        var response = restClient
                .get()
                .uri(uriBuilder -> uriBuilder.path("/current.json ")
                        .queryParam("key", weatherApiKey)
                        .queryParam("q", location)
                        .build())
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
        this.logger.info("Received weather information: {}", response);
        return response != null ? response.toString() : null;
    }
}
