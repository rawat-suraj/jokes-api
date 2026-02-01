package com.example.jokes.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeResponseDto {
 private boolean error;
 private String category;
    private String type;   // "single" or "twopart"
    private FlagDto flags;
    private int id;
    private boolean safe;
    private String lang;

    // present only when type == "single"
    private String joke;

    // present only when type == "twopart"
    private String setup;
    private String delivery;
}
