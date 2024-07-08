package com.juani.exercises.shapes;

public class Circle extends Shape {

    private final int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle area=" + calculateArea() + "\n" + "Circle perimeter=" + calculatePerimeter() + "\n";
    }
}
