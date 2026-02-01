package com.example.jokes.dtos;

import lombok.Data;

@Data
public class FlagDto {
    private boolean nsfw;
    private boolean religious;
    private boolean political;
    private boolean racist;
    private boolean sexist;
    private boolean explicit;
}
