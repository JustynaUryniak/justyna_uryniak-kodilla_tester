package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double sideLengthA;
    private double sideLengthB;
    private double sideLengthC;


    public Shape(double sideLengthA, double sideLengthB, double sideLengthC) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;

    }
    public double getsideLengthA() {
        return sideLengthA;
    }
    public double getsideLengthB() {
        return sideLengthB;
    }
    public double getsideLengthC() {
        return sideLengthC;
    }


    public abstract double CalculateArea();

    public abstract double CalculatePerimeter();
}
