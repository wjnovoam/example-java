package com.wjnovoa.clasesabstractas;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}
