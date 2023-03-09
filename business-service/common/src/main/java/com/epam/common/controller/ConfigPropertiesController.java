package com.epam.common.controller;

import com.epam.common.service.PropertyReader;
import com.epam.common.service.PropertyReaderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {
    private static final String EUREKA_PORT_PROPERTY = "eureka.port";
    private static final String ONE_PORT_PROPERTY = "one.port";
    private static final String TWO_PORT_PROPERTY = "two.port";
    private static final String TWO_API_PORT_PROPERTY = "two-api.port";
    private static final String SERVICE_URL_PORT_PROPERTY = "eureka.client.service-url.defaultZone";
    private final String eurekaPort;
    private final String onePort;
    private final String twoPort;
    private final String twoApiPort;
    private final String eurekaDefaultZone;

    public ConfigPropertiesController() {
        PropertyReader propertyReader = new PropertyReaderImpl();
        eurekaPort = propertyReader.getStringProperty(EUREKA_PORT_PROPERTY);
        onePort = propertyReader.getStringProperty(ONE_PORT_PROPERTY);
        twoPort = propertyReader.getStringProperty(TWO_PORT_PROPERTY);
        twoApiPort = propertyReader.getStringProperty(TWO_API_PORT_PROPERTY);
        eurekaDefaultZone = propertyReader.getStringProperty(SERVICE_URL_PORT_PROPERTY);
    }

    @GetMapping("/eurekaPort")
    public String getEurekaPortValue() {
        return "Eureka port is: " + eurekaPort;
    }

    @GetMapping("/onePort")
    public String getOnePortValue() {
        return "Port for module 'One' is: " + onePort;
    }

    @GetMapping("/twoPort")
    public String getTwoPortValue() {
        return "Port for module 'Two' is: " + twoPort;
    }

    @GetMapping("/twoApiPort")
    public String getTwoApiPortValue() {
        return "Port for module 'Two-api' is: " + twoApiPort;
    }

    @GetMapping("/eurekaZone")
    public String getEurekaDefaultZoneValue() {
        return "Default zone for Eureka is: " + eurekaDefaultZone;
    }
}
