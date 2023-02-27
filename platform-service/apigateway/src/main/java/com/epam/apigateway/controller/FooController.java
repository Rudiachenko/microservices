package com.epam.apigateway.controller;

import com.epam.apigateway.model.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/foos/{id}")
    public Foo findById(@PathVariable long id) {
        return new Foo(1L, "tegrfd");
    }
}
