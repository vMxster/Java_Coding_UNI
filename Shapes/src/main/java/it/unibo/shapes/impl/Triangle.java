package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon{
    
    private static final int AREA_CONST = 2;
    private static final int NUM_EDGES = 3;
    private final double baseEdge;
    private final double leftEdge;
    private final double rightEdge;
    private final double height;
    private double perimeter;
    private double area;

    public Triangle (final double baseEdge, final double leftEdge, final double rightEdge, final double height) {
        this.baseEdge = baseEdge;
        this.leftEdge = leftEdge;
        this.rightEdge = rightEdge;
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
        this.area = (this.baseEdge * this.height) / AREA_CONST;
    }

    public void calculatePerimeter () {
        this.perimeter =  this.baseEdge + this.leftEdge + this.rightEdge;
    }

    public int getEdgeCount () {
        return NUM_EDGES;
    }

}
