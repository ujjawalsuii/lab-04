package com.example.aurora;

public class Triangle extends Shape {
    private double a, b, c; // the three sides

    public Triangle(int x, int y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
