package ru.academits.mukhin.shapes;

public class Rectangle implements Shapes {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {

        return width;
    }

    public double getHeight() {

        return height;
    }

    public double getArea() {

        return width * height;
    }

    public double getPerimeter() {

        return (height + width) * 2;
    }

    @Override
    public String toString() {
        return "width = " + width + " height = " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Rectangle p = (Rectangle) obj;
            return width == p.width && height == p.height;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(width);
        hash = prime * hash + Double.hashCode(height);
        return hash;

    }
}
