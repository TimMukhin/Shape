package ru.academits.mukhin.shapes;

public class Triangle {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public void triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }

    public double getWidth() {
        return Math.max(x1,Math.max(x2,x3))-Math.min(x1,Math.min(x2,x3));
    }

    public double getHeight(){
        return Math.max(y1,Math.max(y2,y3))-Math.min(y1,Math.min(y2,y3));
    }
}
