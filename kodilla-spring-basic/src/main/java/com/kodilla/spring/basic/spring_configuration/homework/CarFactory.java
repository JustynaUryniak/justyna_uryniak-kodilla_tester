package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import java.util.Random;




@Configuration
public class CarFactory {


    @Bean
    public Car createCar() {
        Car car;
        Random generator = new Random();
        int chosen = generator.nextInt(4);
        if (chosen == 0) {
            return new SUV();
        } else if (chosen == 1) {
            return new Sedan();
        } else if (chosen == 2) {
            return new Sedan();
        } else {
            return new Cabrio();
        }
    }
}
