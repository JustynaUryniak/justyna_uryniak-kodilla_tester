package com.kodilla.abstracts.homework;

public class Triangle extends Shape{


    public Triangle() {
        super(3,4, 5);
    }

    @Override
    public double CalculateArea() {
        return (getsideLengthA() * getsideLengthB())/ 2;
    }

    @Override
    public double CalculatePerimeter() {
        return getsideLengthA() + getsideLengthB() + getsideLengthC();
    }
}
