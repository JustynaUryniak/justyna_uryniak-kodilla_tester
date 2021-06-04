package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    boolean headLightsOn;

    public Sedan(boolean headLightsOn) {
        this.headLightsOn = headLightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (headLightsOn) {
            return  true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
