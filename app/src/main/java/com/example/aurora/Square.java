package com.example.aurora;

public class Square extends Shape {
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
