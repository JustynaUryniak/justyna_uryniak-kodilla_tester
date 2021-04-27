package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speed;
    private static final int increase = 30;
    private static final int decrease =30;

    public Mercedes(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Mercedes sped up to: ");
        System.out.println(speed += increase);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Mercedes slowed down to: ");
        System.out.println(speed -= decrease);
    }
}
