package com.example.jokes.services.joke;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.jokes.client.JokeApiClient;
import com.example.jokes.dtos.JokeResponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JokeServiceImpl implements JokeService {
    private final JokeApiClient jokeApiClient;

    @Override
    public JokeResponseDto getJoke(String categoryName, String flag) {
        JokeResponseDto joke;
        if (flag == null || flag.isEmpty()) {
            joke = jokeApiClient.getJoke(categoryName, Map.of());
        } else {
            joke = jokeApiClient.getJoke(categoryName, Map.of("blacklistFlags", flag));
        }
        if (joke.isError()) {
            throw new RuntimeException("Error");
        }
        return joke;
    }
}
