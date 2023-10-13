package it.unibo.shapes.test;

import it.unibo.shapes.impl.*;

public class WorkWithShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        Square square = new Square(10.0);
        Triangle triangle = new Triangle(10.0, 20.0, 40.0, 15.0);
        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Number of Rectangle Edges: " + rectangle.getEdgeCount());
        System.out.println("Number of Square Edges: " + square.getEdgeCount());
        System.out.println("Number of Triangle Edges: " + triangle.getEdgeCount());
    }
}
