package com.juani.exercises;

import java.util.Scanner;

public class ConvertToString {
    public static void convert(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Incorrect number format " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to convert: ");
        String text = scanner.next();

        convert(text);
    }
}