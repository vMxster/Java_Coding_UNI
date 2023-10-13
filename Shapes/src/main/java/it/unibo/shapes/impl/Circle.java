package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;
import java.lang.Math;

public class Circle implements Shape {

    private static final int PERIMETER_CONST = 2;
    private final double radius;
    private double perimeter;
    private double area;

    public Circle (final double radius) {
        this.radius = radius;
        this.perimeter = 0;
        this.area = 0;
    }

    public double getArea () {
        return this.area;
    } 

    public double getPerimeter () {
        return this.perimeter;
    } 

    public void calculateArea () {
        this.area = Math.PI * (this.radius * this.radius);
    }

    public void calculatePerimeter () {
        this.perimeter =  Math.PI * this.radius * PERIMETER_CONST;
    }

}