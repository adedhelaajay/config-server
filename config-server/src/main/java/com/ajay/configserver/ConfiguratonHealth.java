package com.ajay.configserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfiguratonHealth {

    @RequestMapping("/")
    public String getHealthCheck() {

        return "Config server up!";
    }
}
