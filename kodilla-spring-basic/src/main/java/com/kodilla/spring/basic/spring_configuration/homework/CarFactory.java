package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalTime;
import java.util.Random;


@Configuration
public class CarFactory {

    LocalTime time = LocalTime.of(23,7);

    @Bean
    public Car createCar() {
        LocalTime firstTime = LocalTime.of(6, 0);
        LocalTime secondTime = LocalTime.of(20, 0);
        boolean headLightsOn;
        if (time.isAfter(firstTime) && time.isBefore(secondTime)) {
            headLightsOn = false;
        } else {
            headLightsOn = true;
        }
        Car car;
        Random generator = new Random();
        int chosen = generator.nextInt(4);
        if (chosen == 0) {
            return new SUV(headLightsOn);
        } else if (chosen == 1) {
            return new Sedan(headLightsOn);
        } else if (chosen == 2) {
            return new Sedan(headLightsOn);
        } else {
            return new Cabrio(headLightsOn);
        }
    }
}
