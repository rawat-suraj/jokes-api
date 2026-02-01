package com.example.jokes.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryResponseDto {
    private boolean error;
    private List<String> categories;
    private List<CategoryAliasDto> categoryAliases;
    private long timestamp;
}
