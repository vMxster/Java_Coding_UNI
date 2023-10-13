package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon{
    
    private static final int PERIMETER_CONST = 2;
    private static final int NUM_EDGES = 4;
    private final double base;
    private final double height;
    private double perimeter;
    private double area;

    public Rectangle (final double base, final double height) {
        this.base = base;
        this.height = height;
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
        this.area = this.base * this.height;
    }

    public void calculatePerimeter () {
        this.perimeter =  (PERIMETER_CONST * this.base) + (PERIMETER_CONST * this.height);
    }

    public int getEdgeCount () {
        return NUM_EDGES;
    }

}
