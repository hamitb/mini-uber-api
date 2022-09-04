package com.bootcamp.uber.interfaceTest;

public class AreaCalculator {
    public static void calculateArea(Shape shape) {
        System.out.println("Area of shape is: " + shape.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 5);
        Square square = new Square(9);

        calculateArea(rectangle);
        calculateArea(circle);
        calculateArea(triangle);
        calculateArea(square);

    }
}
