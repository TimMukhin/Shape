package ru.academits.mukhin.shapes;

public class Triangle implements Shapes {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double getWidth() {

        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    public double getHeight() {

        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    public double getArea() {

        return getHeight() * getWidth() / 2;
    }

    public double getPerimeter() {
        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
            System.out.println("Точки лежат на одной прямой");
            return 0;
        } else {
            double sideA = Math.abs(Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2)));
            double sideB = Math.abs(Math.sqrt(Math.pow((y3 - y2), 2) + Math.pow((x3 - x2), 2)));
            double sideC = Math.abs(Math.sqrt(Math.pow((y3 - y1), 2) + Math.pow((x3 - x1), 2)));
            return sideA + sideB + sideC;
        }
    }

    @Override
    public String toString() {
        return "X1 = " + x1 + " X2 = " + x2 + " X3 = " + x3 + " Y1 = " + y1 + " Y2 = " + y2 + " Y3 = " + y3;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Triangle p = (Triangle) obj;
            return x1 == p.x1 && x2 == p.x2 && x3 == p.x3 && y1 == p.y1 && y2 == p.y2 && y3 == p.y3;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(x1);
        hash = prime * hash + Double.hashCode(x2);
        hash = prime * hash + Double.hashCode(x3);
        hash = prime * hash + Double.hashCode(y1);
        hash = prime * hash + Double.hashCode(y2);
        hash = prime * hash + Double.hashCode(y3);
        return hash;

    }
}