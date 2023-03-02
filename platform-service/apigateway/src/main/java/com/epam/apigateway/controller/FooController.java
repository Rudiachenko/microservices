package com.epam.apigateway.controller;

import com.epam.apigateway.model.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/foos/test")
    public Foo findById() {
        return new Foo(1L, "test");
    }
}
