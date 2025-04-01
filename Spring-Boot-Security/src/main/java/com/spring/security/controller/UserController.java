package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @PostMapping("/hello")
    public String postHello(){
        return "Post Hello";
    }
}
