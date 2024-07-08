package com.juani.exercises.shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calculateArea() {
        return (int) ((base * height) / 2);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (sideA + sideB + sideC);
    }

    @Override
    public String toString() {
        return "Triangle area=" + calculateArea() + "\n" + "Triangle perimeter=" + calculatePerimeter() + "\n";
    }
}
