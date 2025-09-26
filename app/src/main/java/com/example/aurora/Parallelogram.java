package com.example.aurora;

public class Parallelogram extends Shape{
    private int base;
    private int adjacent;
    private int height;

    public Parallelogram(int x, int y, int base, int side, int height) {
        super(x, y);
        this.base = base;
        this.adjacent = side;
        this.height = height;
    }
    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + adjacent);
    }

}
