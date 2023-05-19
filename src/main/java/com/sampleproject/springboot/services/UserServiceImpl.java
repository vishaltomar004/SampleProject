package com.sampleproject.springboot.services;

import com.sampleproject.springboot.entities.User;
import com.sampleproject.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
      @Autowired
 private UserRepository userRepository;
    @Override
    public List<User> getAlluser() {

        return (List<User>) userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
       userRepository.save(user);
    }


}
