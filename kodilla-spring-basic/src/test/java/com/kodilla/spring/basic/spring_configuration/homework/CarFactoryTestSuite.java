package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    @Test
    public void shouldCreateRandomCar() {
        Car car = (Car) context.getBean("createCar");

        String carType = car.getCarType();
        System.out.println(carType);

        List<String> possibleCarTypes = Arrays.asList("SUV", "Cabrio", "Sedan");
        assertTrue(possibleCarTypes.contains(carType));
    }

    @Test
    public void shouldCreateRandomCarWithTurnedOnHeadLights() {
        Car car = (Car) context.getBean("createCar");

        String carType = car.getCarType();
        System.out.println(carType);
        System.out.println(car.hasHeadlightsTurnedOn());

        List<String> possibleCarTypes = Arrays.asList("SUV", "Cabrio", "Sedan");
        assertTrue(possibleCarTypes.contains(carType));
        assertTrue(car.hasHeadlightsTurnedOn());
    }
}