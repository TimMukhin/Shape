package ru.academits.mukhin.shapes;

public class Circle implements Shapes {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getWidth() {

        return radius;
    }

    public double getHeight() {

        return radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    public double getPerimeter() {

        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Circle p = (Circle) obj;
            return radius == p.radius;
        }
    }

    @Override
    public int hashCode() {
        final int prime=37;
        int hash=1;
        hash = prime * hash + Double.hashCode(radius);
        return hash;
    }
}