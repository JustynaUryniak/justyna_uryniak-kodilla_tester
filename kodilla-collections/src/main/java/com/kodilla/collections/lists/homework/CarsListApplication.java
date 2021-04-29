package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(100);
        cars.add(new Kia(110));
        cars.add(ford);
        cars.add(new Mercedes(120));

        cars.remove(0);
        cars.remove(ford);

        System.out.println(cars.size());
        for (Car car: cars) {
                CarUtils.describeCar(car);
        }
    }
}
