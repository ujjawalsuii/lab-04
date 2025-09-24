package com.example.aurora;

public class Hexagon extends Shape {
    private int side;


    public Hexagon(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }
    @Override
    public double getPerimeter() {
        return (side * 6);
    }
}
