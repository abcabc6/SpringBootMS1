package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/")
    public String hello(){
        return "Greetings from Spring Boot + Docker ZhangXu!! 233333";
    }
}