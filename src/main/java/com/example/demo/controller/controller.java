package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
