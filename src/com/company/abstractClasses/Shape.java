package com.company.abstractClasses;

public class Shape {
    String color = "red";
    boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(filled){
            return String.format("A Shape with color of %s and filled", color);
        }
        return String.format("A Shape with color of %s and not filled", color);
    }
}
