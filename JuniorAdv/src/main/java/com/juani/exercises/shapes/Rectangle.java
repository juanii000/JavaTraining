package com.juani.exercises.shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return (int) (width * height);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * (width + height));
    }

    @Override
    public String toString() {
        return "Rectangle area=" + calculateArea() + "\n" + "Rectangle perimeter=" + calculatePerimeter() + "\n";
    }
}
