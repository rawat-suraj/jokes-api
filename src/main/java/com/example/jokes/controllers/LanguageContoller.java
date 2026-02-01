package com.example.jokes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguageContoller {
    @GetMapping("/list")
    public ResponseEntity<String> getAllLanguages() {
        return ResponseEntity.ok("Languages not implemented yet");
    }

    @GetMapping("/langCode/{language}")
    public ResponseEntity<String> getLangCode(@PathVariable String language) {
        return ResponseEntity.ok("LangCode not implemented yet");
    }
}
