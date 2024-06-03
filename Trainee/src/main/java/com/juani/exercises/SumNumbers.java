package com.juani.exercises;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number to sum, stops when negative: ");
            number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);

        System.out.println("The sum of the entered numbers is: " + sum);
    }
}