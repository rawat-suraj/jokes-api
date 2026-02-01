package com.example.jokes.services.joke;

import com.example.jokes.dtos.JokeResponseDto;

public interface JokeService {
    public JokeResponseDto getJoke(String categoryName, String flag);
}
