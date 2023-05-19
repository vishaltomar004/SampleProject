package com.sampleproject.springboot.controller;

import com.sampleproject.springboot.entities.User;
import com.sampleproject.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SampleUserController {
    @Autowired
    private UserService userService;

    @PostMapping("create")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAlluser();

    }

    @GetMapping("/start")
    public String check() {
        return "The has been started perfectely";
    }
}
