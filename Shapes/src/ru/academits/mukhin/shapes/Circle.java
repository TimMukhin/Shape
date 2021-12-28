package ru.academits.mukhin.shapes;

public class Circle {
    private double radius;

    public void circle (double radius){
        this.radius=radius;
    }

    public double getWidth(){
        return radius;
    }

    public double getHeight(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*2*radius;
    }
}
