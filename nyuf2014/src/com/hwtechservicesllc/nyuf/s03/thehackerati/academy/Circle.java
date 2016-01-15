package com.hwtechservicesllc.nyuscpsf2014.s03.thehackerati.academy;

public class Circle extends Shape {
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

}
