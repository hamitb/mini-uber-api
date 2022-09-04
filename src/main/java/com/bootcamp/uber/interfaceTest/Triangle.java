package com.bootcamp.uber.interfaceTest;

public class Triangle implements Shape {
    private int x;
    private int y;

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return x * y / 2.0;
    }
}
