package com.bootcamp.uber.interfaceTest;

public class Circle implements Shape {
    private static int PI = 3;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public static int getPI() {
        return PI;
    }

    public static void setPI(int PI) {
        Circle.PI = PI;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
}
