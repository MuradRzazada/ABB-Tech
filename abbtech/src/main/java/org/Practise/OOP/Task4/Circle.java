package org.Practise.OOP.Task4;

public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
