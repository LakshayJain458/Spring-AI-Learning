package org.example.spring_ai.tools;

import org.slf4j.Logger;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeTool {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @Tool(description = "Get the current date and time in users zone.")
    public String getCurrentDateTime() {
        this.logger.info("Tool calling");
        this.logger.info("Get the current date and time in users zone.");
        return LocalDateTime
                .now()
                .atZone(LocaleContextHolder.getTimeZone().toZoneId())
                .toString();
    }
}
