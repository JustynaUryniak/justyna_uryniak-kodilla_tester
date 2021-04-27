package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private static final int increase = 10;
    private static final int decrease = 20;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Ford sped up to: ");
        System.out.println(speed += increase);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Ford slowed down to: ");
        System.out.println(speed -= decrease);
    }
}
