package com.example.jokes.client;

import com.example.jokes.dtos.JokeResponseDto;
import lombok.RequiredArgsConstructor;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JokeApiClient {
    private final ApiClient api;

    public JokeResponseDto getJoke(String categoryName, Map<String, ?> flags) {
        return api.get("/joke/" + categoryName, flags, JokeResponseDto.class);
    }
}
