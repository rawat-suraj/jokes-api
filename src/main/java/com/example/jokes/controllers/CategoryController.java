package com.example.jokes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jokes.dtos.CategoryResponseDto;
import com.example.jokes.services.category.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<CategoryResponseDto> getCategories() {
        CategoryResponseDto categories = categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }
}
