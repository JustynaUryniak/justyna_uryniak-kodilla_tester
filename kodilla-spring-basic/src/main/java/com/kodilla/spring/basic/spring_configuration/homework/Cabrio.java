package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    LocalTime time = LocalTime.of(20,23);

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime firstTime = LocalTime.of(6, 0);
        LocalTime secondTime = LocalTime.of(20, 0);
        if (time.isAfter(firstTime) && time.isBefore(secondTime)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
