package com.juani.exercises.model;

import java.util.List;

public class Student {
    private final String name;
    private final int age;
    private final List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student " + name + "\nage " + age + "\nsubjects " + subjects;
    }
}
