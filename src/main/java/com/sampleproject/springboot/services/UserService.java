package com.sampleproject.springboot.services;

import com.sampleproject.springboot.controller.SampleUserController;
import com.sampleproject.springboot.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getAlluser();
    public void addUser(User user);




}
