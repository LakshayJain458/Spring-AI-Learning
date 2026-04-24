package org.example.spring_ai;

import org.example.spring_ai.tools.weatherTool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private weatherTool weatherTool;

    @Test
    void getWeatherTest() {
        var response = weatherTool.getWeather("Ghaziabad India");
        System.out.println(response);
    }

}
