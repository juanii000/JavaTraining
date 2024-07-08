package com.juani.exercises.controller;

import com.juani.exercises.model.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
class UserController {

    @PostMapping("/register")
    public Message registerUser(@RequestParam("name") String name, @RequestParam("lastname") String lastname) {

        return new Message( "user " + name + " " + lastname + " was successfully registered");
    }
}
