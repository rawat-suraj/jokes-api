package com.example.jokes.client;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class LanguageApiClient {
    private final ApiClient api;

    public String getLanguages() {
        return api.get("/languages", String.class);
    }
}
