package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("------------------------------");
        System.out.println("The car brand: " + getCarBrand(car));
        car.increaseSpeed();
    }
    private static String getCarBrand(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else
            return "Unknown car brand";
    }
}
