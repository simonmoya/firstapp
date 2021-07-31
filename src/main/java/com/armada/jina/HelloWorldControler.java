package com.armada.jina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salute")
public class HelloWorldControler {
    @GetMapping("/backend")
    public String Salute() {
        return "My First Back End App with Spring Boot for BackEnd! ";
    }
}