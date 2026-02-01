package com.example.jokes.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class JokeRequestDto {
    private String flags;
}
