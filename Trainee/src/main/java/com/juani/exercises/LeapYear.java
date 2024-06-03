package com.juani.exercises;

import java.util.Scanner;

public class LeapYear {
    public static void isLeapYear(int year) {
        System.out.println (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        isLeapYear(year);
    }
}