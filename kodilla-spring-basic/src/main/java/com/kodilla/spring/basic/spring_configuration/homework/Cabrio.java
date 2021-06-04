package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    boolean headLightsOn;

    public Cabrio(boolean headLightsOn) {
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
        return "Cabrio";
    }
}
