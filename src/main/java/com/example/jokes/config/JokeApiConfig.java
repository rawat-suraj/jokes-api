package com.example.jokes.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@NoArgsConstructor
public class JokeApiConfig {
    @Value("${joke.api.base-url}")
    private @NonNull String baseUrl;

    @Bean
    WebClient jokeWebClient() {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }
}
