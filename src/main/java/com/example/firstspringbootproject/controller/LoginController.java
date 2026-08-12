package com.example.firstspringbootproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspringbootproject.entity.User;
import com.example.firstspringbootproject.repository.UserRepository;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/login")
    public String login(@RequestBody User loginUser) {

        Optional<User> user =
                userRepository.findByUsername(
                        loginUser.getUsername()
                );


        if (user.isPresent()
                && user.get().getPassword()
                    .equals(loginUser.getPassword())) {

            return "Login Successful";

        }


        return "Invalid username or password";

    }

}