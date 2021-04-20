package com.kodilla.inheritance.homework;

public class Action {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1954);
        operatingSystem.turnOff();

        MsWindows msWindows = new MsWindows(1985);
        msWindows.turnOn();

        MacOsX macOsX = new MacOsX(2001);
        macOsX.displayYearOfProduction();
        macOsX.update();
    }
}
