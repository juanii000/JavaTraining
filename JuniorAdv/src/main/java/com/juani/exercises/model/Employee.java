package com.juani.exercises.model;

public class Employee{
    private Person person;
    private double salary;
    private String position;

    public Employee(Person person, double salary, String position) {
        this.person = person;
        this.salary = salary;
        this.position = position;
    }

}
