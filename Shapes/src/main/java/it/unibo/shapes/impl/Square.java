package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon{
    
    private static final int PERIMETER_CONST = 4;
    private static final int NUM_EDGES = 3;
    private final double edge;
    private double perimeter;
    private double area;

    public Square (final double edge) {
        this.edge = edge;
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
        this.area = this.edge * this.edge;
    }

    public void calculatePerimeter () {
        this.perimeter =  PERIMETER_CONST * this.edge;
    }

    public int getEdgeCount () {
        return NUM_EDGES;
    }
    
}
