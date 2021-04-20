package com.kodilla.inheritance.homework;

public class MsWindows extends OperatingSystem {

    public MsWindows(int yearOfProduction) {
        super(yearOfProduction);
    }

    public void turnOn() {
        System.out.println("The operating system was turned on in 3 seconds.");
    }
    public void turnOff() {
        System.out.println("The operating system was turned off in 2 seconds.");
    }
    public void update() {
        System.out.println("The operating system was updated 1 day ago.");
    }
 }
