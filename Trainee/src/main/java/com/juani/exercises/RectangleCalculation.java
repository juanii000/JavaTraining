package com.juani.exercises;

public class RectangleCalculation {
    private final int base;
    private final int height;

    public RectangleCalculation(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int calculateArea() {
        return base * height;
    }

    public static void main(String[] args) {
        RectangleCalculation rectangle = new RectangleCalculation(5, 10);
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
    }
}