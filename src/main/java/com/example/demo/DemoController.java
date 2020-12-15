package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${demo.secret}")
    private String secret;

    @GetMapping("/secret")
    public String getSecret() {
        return secret;
    }
}
