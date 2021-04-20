package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfProduction;

    public OperatingSystem(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void turnOn() {
        System.out.println("The operating system was turned on.");
}
    public void turnOff() {
        System.out.println("The operating system was turned off.");
    }
    public void displayYearOfProduction() {
        System.out.println("The year of production: " + yearOfProduction);
    }
}
