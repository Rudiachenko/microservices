package com.epam.two.controller;

import com.netflix.servo.monitor.BasicTimer;
import com.netflix.servo.monitor.MonitorConfig;
import com.netflix.servo.monitor.Stopwatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.concurrent.TimeUnit.SECONDS;

@RestController
public class TwoController {
    private final BasicTimer timer;

    public TwoController() {
        this.timer = new BasicTimer(MonitorConfig.builder("timer").build(), SECONDS);
    }

    @GetMapping("/redirect")
    public String getAnotherTestPageAfterRedirect() {
        return "redirect testing";
    }

    @GetMapping("/test")
    public String getTestPage() {
        return "test";
    }

    @GetMapping("/timer")
    public String testTimer() {
        Stopwatch stopwatch = timer.start();
        try {
            SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException");
        }
        timer.record(3, SECONDS);
        stopwatch.stop();
        return String.format("Timer of requests to current endpoint is %d",
                timer.getTotalTime().intValue());
    }
}
