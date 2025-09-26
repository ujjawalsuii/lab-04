package com.example.aurora;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int x, int y, double width, double height) {
        super(x, y); // calls Shape constructor
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
