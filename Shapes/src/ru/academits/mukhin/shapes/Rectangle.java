package ru.academits.mukhin.shapes;

public class Rectangle {
    private double sideLenght;
    private double sideHeight;

    public double getWidth(){
        return sideLenght;
    }
    public double getSideHeight() {
        return sideHeight;
    }

    public double getArea() {
        return sideLenght*sideHeight;
    }

    public double getPerimeter(){
        return (sideHeight+sideLenght)*2;
    }
}
