package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(2.5,2.5,2.5);
    }

    @Override
    public double CalculateArea() {
        return getsideLengthA() * getsideLengthA();
    }

    @Override
    public double CalculatePerimeter() {
        return 4 * getsideLengthA();
    }
}
