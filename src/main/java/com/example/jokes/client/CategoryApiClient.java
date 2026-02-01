package com.example.jokes.client;

import com.example.jokes.dtos.CategoryResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryApiClient {
    private final ApiClient api;

    public CategoryResponseDto getJoke(String categoryName) {
        return api.get("/joke/${categoryName}", CategoryResponseDto.class);
    }

    public CategoryResponseDto getCategoryList() {
        return api.get("/categories", CategoryResponseDto.class);
    }
}
