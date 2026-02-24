package com.example.airisk.controller;

import com.example.airisk.service.GeminiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/risk")
@CrossOrigin
public class RiskController {

    private final GeminiService geminiService;

    public RiskController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping
    public String analyze(@RequestBody String description) {
        return geminiService.analyzeProject(description);
    }
}