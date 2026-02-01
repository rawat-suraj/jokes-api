package com.example.jokes.client;

import org.springframework.stereotype.Component;

import com.example.jokes.dtos.FlagDto;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FlagApiClient {
    private final ApiClient api;

    public FlagDto getFlags() {
        return api.get("/flags", FlagDto.class);
    }
}
