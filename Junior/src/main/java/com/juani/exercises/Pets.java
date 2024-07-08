package com.juani.exercises;

import com.juani.exercises.interfaces.Animal;

public class Pets {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Guau");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
