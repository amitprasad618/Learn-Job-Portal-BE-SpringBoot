package com.amit.JobPortal.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet() {
        return "Welcome to Amit Page!!";
    }
}
