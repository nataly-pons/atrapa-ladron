package com.ejemplo.ladron_librado.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
  
}
