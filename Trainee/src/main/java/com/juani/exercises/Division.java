package com.juani.exercises;

import java.util.Scanner;

public class Division {
    public static String divide(int a, int b) {
        if (b == 0) {
            return "cant divide by 0";
        }else {
            return String.valueOf(a / b);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println(divide(a, b));
    }
}