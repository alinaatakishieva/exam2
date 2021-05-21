package com.company;

public class Circle {
    private double radius;
    final double PI = 3.14;

    public double getArea(){
        return PI * radius * radius;
    }

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }
}
