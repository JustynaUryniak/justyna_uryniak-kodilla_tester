package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super (4.2,2.2,4.2);
    }

    @Override
    public double CalculateArea() {
        return getsideLengthA() * getsideLengthB();
    }

    @Override
    public double CalculatePerimeter() {
        return 2 * getsideLengthA() + 2 * getsideLengthB();
    }
}
