package com.spring.security.controller;

import com.spring.security.entity.User;
import com.spring.security.service.CustomUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final CustomUserService service;

    public UserController( CustomUserService service){
        this.service = service;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @PostMapping()
    public void postHello(@RequestBody User user){
        service.createUser(user);
    }
}
