package com.epam.common.controllers;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {

    private final DynamicStringProperty eurekaPort;
    private final DynamicStringProperty onePort;
    private final DynamicStringProperty twoPort;
    private final DynamicStringProperty twoApiPort;
    private final DynamicStringProperty eurekaDefaultZone;

    public ConfigPropertiesController() {
        eurekaPort = DynamicPropertyFactory.getInstance().getStringProperty("eureka.port", "not found");
        onePort = DynamicPropertyFactory.getInstance().getStringProperty("one.port", "not found");
        twoPort = DynamicPropertyFactory.getInstance().getStringProperty("two.port", "not found");
        twoApiPort = DynamicPropertyFactory.getInstance().getStringProperty("two-api.port", "not found");
        eurekaDefaultZone = DynamicPropertyFactory.getInstance()
                .getStringProperty("eureka.client.service-url.defaultZone", "not found");
    }

    @GetMapping("/eurekaPort")
    public String getEurekaPortValue() {
        return "Eureka port is: " + eurekaPort.getValue();
    }

    @GetMapping("/onePort")
    public String getOnePortValue() {
        return "Port for module 'One' is: " + onePort.getValue();
    }

    @GetMapping("/twoPort")
    public String getTwoPortValue() {
        return "Port for module 'Two' is: " + twoPort.getValue();
    }

    @GetMapping("/twoApiPort")
    public String getTwoApiPortValue() {
        return "Port for module 'Two-api' is: " + twoApiPort.getValue();
    }

    @GetMapping("/eurekaZone")
    public String getEurekaDefaultZoneValue() {
        return "Default zone for Eureka is: " + eurekaDefaultZone.getValue();
    }
}
