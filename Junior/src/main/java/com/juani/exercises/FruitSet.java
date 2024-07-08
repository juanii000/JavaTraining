package com.juani.exercises;

import java.util.HashSet;
import java.util.Scanner;

public class FruitSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while ((fruits.size() <= 5)){
            System.out.print("enter a fruit: ");
            String fruit = scanner.next();
            if (!fruits.contains(fruit)){ //if element already exist wont be added
                fruits.add(scanner.next());
            }else {
                System.out.print("The fruit already exists\n");
            }
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}