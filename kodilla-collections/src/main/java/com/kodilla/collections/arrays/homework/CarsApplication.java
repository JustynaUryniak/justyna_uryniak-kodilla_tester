package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n <cars.length; n++)
            cars[n] = drawCar();
        for (Car car: cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        if (drawnCarBrand == 0)
            return new Ford(b);
        else if (drawnCarBrand == 1)
            return new Kia(b);
        else
            return new Mercedes(c);
    }
}
