package com.epam.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @GetMapping("/test")
    public String getEurekaPortValue() {
        return "test";
    }
}
