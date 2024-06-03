package com.juani.exercises;

public class CheckNumber {
    public static void check(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        check(5);
        check(-3);
        check(0);
    }
}