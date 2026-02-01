package com.example.jokes.services.category;

import org.springframework.stereotype.Service;

import com.example.jokes.client.CategoryApiClient;
import com.example.jokes.dtos.CategoryResponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryApiClient categoryApiClient;

    @Override
    public CategoryResponseDto getAllCategories() {
        CategoryResponseDto categories = categoryApiClient.getCategoryList();
        if (categories.isError()) {
            throw new RuntimeException("Category error");
        }
        return categories;
    }
}
