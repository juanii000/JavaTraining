package com.juani.exercises.controller;

import com.juani.exercises.model.Message;
import com.juani.exercises.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
class WelcomeController {

    @GetMapping("/welcome")
    public Message welcome() {
        return new Message("WELCOME");
    }

    @GetMapping("/student")
    public String studentController() {
        List<String> subjects = List.of("Math", "Science", "English");
        Student student = new Student("John", 20, subjects);
        System.out.println(student);
        return student.toString();
    }
}

