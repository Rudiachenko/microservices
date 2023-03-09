package com.epam.javacc.discovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

    @GetMapping("/test")
    public String getTestPage() {
        return "test";
    }
}
