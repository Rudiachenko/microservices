package com.epam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoApiController {

    @GetMapping("/test")
    public String getEurekaPortValue() {
        return "test";
    }
}
