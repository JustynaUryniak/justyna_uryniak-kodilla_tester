package com.kodilla.inheritance.homework;

public class MacOsX extends OperatingSystem {

    public MacOsX(int yearOfProduction) {
        super(yearOfProduction);
    }

    public void turnOn() {
        System.out.println("The operating system was turned on in 5 seconds.");
    }

    public void turnOff() {
        System.out.println("The operating system was turned off in 4 seconds.");
    }
}
