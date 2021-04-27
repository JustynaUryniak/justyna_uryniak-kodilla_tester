package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100);
        doRace(ford);

        Kia kia = new Kia(110);
        doRace(kia);

        Mercedes mercedes = new Mercedes(120);
        doRace(mercedes);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Current speed: " + car.getSpeed());
    }
}
