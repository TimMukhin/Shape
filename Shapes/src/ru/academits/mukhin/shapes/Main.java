package ru.academits.mukhin.shapes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);

        Rectangle rectangle1 = new Rectangle(8, 12);
        Rectangle rectangle2 = new Rectangle(14, 10);

        Square square1 = new Square(10);
        Square square2 = new Square(15);

        Triangle triangle1 = new Triangle(0, 0, 3, 0, 0, 4);
        Triangle triangle2 = new Triangle(0, 0, 6, 0, 0, 8);

        double[] areas = {circle1.getArea(), circle2.getArea(), rectangle1.getArea(), rectangle2.getArea(), square1.getArea(), square2.getArea(), triangle1.getArea(), triangle2.getArea()};
        System.out.println(Arrays.toString(areas));

        Arrays.sort(areas);
        System.out.println("Самая большая площадь: " + areas[areas.length - 1]);

        double[] perimeter = {circle1.getPerimeter(), circle2.getPerimeter(), rectangle1.getPerimeter(), rectangle2.getPerimeter(), square1.getPerimeter(), square2.getPerimeter(), triangle1.getPerimeter(), triangle2.getPerimeter()};
        System.out.println(Arrays.toString(perimeter));

        Arrays.sort(perimeter);
        System.out.println("Второй по величине периметр: " + perimeter[perimeter.length - 2]);

        System.out.println(rectangle1);
        System.out.println(square1);

        System.out.println(circle1);
        System.out.println(triangle1);

        Rectangle rectangle3 = new Rectangle(10, 12);
        Rectangle rectangle4 = new Rectangle(10, 12);

        Circle circle3=new Circle(5);
        Circle circle4=new Circle(6);

        Square square3=new Square(4);
        Square square4= new Square(4);

        Triangle triangle3=new Triangle(1,2,3,4,5,6);
        Triangle triangle4=new Triangle(1,2,3,4,5,6);

        if (rectangle3.equals(rectangle4)) {
            System.out.println("Rectangles Equal !");
        } else {
            System.out.println("Rectangles Not Equal !");
        }

        if (circle3.equals(circle4)) {
            System.out.println("Circles Equal !");
        } else {
            System.out.println("Circles Not Equal !");
        }

        if (square3.equals(square4)) {
            System.out.println("Squares Equal !");
        } else {
            System.out.println("Squares Not Equal !");
        }

        if (triangle3.equals(triangle4)) {
            System.out.println("Triangles Equal !");
        } else {
            System.out.println("Triangles Not Equal !");
        }
    }
}
