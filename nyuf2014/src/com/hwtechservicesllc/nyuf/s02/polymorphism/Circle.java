package com.hwtechservicesllc.nyuscpsf2014.s02.polymorphism;

/**
 * Created by computerlab on 9/13/14.
 */
public class Circle extends Shape {
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}