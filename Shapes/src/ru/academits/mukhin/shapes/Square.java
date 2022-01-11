package ru.academits.mukhin.shapes;

public class Square implements Shapes {
    private double sideLenght;

    public Square(double sideLenght) {

        this.sideLenght = sideLenght;
    }

    public double getWidth() {

        return sideLenght;
    }

    public double getHeight() {

        return sideLenght;
    }

    public double getArea() {

        return sideLenght * sideLenght;
    }

    public double getPerimeter() {

        return sideLenght * 4;
    }

    @Override
    public String toString() {
        return "Side lenght = " + sideLenght;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Square p = (Square) obj;
            return sideLenght == p.sideLenght;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(sideLenght);
        return hash;
    }
}