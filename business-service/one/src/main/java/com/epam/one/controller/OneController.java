package com.epam.one.controller;

import com.netflix.servo.monitor.BasicCounter;
import com.netflix.servo.monitor.Counter;
import com.netflix.servo.monitor.MonitorConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {
    private final Counter counter;

    public OneController() {
        this.counter = new BasicCounter(MonitorConfig.builder("counter").build());
    }

    @GetMapping("/test")
    public String getTestPage() {
        return "test";
    }

    @GetMapping("/count")
    public String countVisits() {
        counter.increment();
        return String.format("Number of requests to current endpoint is %d",
                counter.getValue().intValue());
    }
}
