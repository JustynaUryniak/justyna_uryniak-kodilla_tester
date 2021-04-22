package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square();
        square.CalculateArea();
        square.CalculatePerimeter();
        System.out.println("The area of a square = " + square.CalculateArea());
        System.out.println("The perimeter of a square = " + square.CalculatePerimeter());

        Triangle triangle = new Triangle();
        triangle.CalculateArea();
        triangle.CalculatePerimeter();
        System.out.println("The area of a triangle = " + triangle.CalculateArea());
        System.out.println("The perimeter of a triangle = " + triangle.CalculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.CalculateArea();
        rectangle.CalculatePerimeter();
        System.out.println("The area of a rectangle = " + rectangle.CalculateArea());
        System.out.println("The perimeter of a rectangle = " + rectangle.CalculatePerimeter());
    }
}
