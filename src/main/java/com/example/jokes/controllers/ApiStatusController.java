package com.example.jokes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class ApiStatusController {
    @GetMapping("")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("Status not implemented yet");
    }
}
