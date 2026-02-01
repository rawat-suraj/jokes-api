package com.example.jokes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jokes.dtos.FlagDto;
import com.example.jokes.services.flag.FlagService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/flags")
@RequiredArgsConstructor
public class FlagController {
    private final FlagService flagService;

    @GetMapping("")
    public ResponseEntity<FlagDto> getFlags() {
        FlagDto flags = flagService.getFlags();
        return ResponseEntity.ok(flags);
    }
}
