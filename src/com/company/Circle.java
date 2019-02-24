package com.company;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter(){
        return 6.28*radius;
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius=%f, which is a subclass of %s",radius, super.toString());
    }


}
