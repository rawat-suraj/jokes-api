package com.example.jokes.controllers;

import com.example.jokes.dtos.JokeRequestDto;
import com.example.jokes.dtos.JokeResponseDto;
import com.example.jokes.services.joke.JokeService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/joke")
@RequiredArgsConstructor
public class JokeController {
    private final JokeService jokeService;

    /*
     * @GetMapping("/")
     * public ResponseEntity<JokeResponseDto> getJokes() {
     * JokeResponseDto joke = jokeService.getJoke(null)
     * return ResponseEntity.ok("Jokes");
     * }
     */

    @GetMapping("/{categoryName}")
    public ResponseEntity<JokeResponseDto> getJokeByCategoryName(@PathVariable String categoryName,
            @ModelAttribute JokeRequestDto req) {
        JokeResponseDto joke = jokeService.getJoke(categoryName, req.getFlags());
        return ResponseEntity.ok(joke);
    }
}
