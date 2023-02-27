package com.epam.javacc.discovery.controller;

import com.epam.javacc.discovery.model.Foo;
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