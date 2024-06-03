package com.juani.exercises;

public class Average {
    public static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println("The average is: " + calculateAverage(32,65,43));
    }
}