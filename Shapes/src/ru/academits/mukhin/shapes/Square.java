package ru.academits.mukhin.shapes;

public class Square {
    private double sideLenght;

    public void square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public double getWidht(){
        return sideLenght;
    }
    public double getHeight(){
        return sideLenght;
    }
    public double getArea() {
        return sideLenght*sideLenght;
    }
    public double getPerimetr() {
        return sideLenght*4;
    }
}
