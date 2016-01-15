package com.hwtechservicesllc.nyuscpsf2014.s03.thehackerati.academy;

public class Square extends Shape {
    public double side;

    public Square(double r) {
        side = r;
    }

    public double area() {
        return Math.pow(side, 2.0);
    }
}
