package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private int speed;
    private static final int increase = 20;
    private static final int decrease = 10;

    public Kia(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Kia sped up to: ");
        System.out.println(speed += increase);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Kia slowed down to: ");
        System.out.println(speed -= decrease);
    }
}
