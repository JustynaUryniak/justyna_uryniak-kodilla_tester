package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    boolean headLightsOn;

    public SUV(boolean headLightsOn) {
        this.headLightsOn = headLightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (headLightsOn) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
