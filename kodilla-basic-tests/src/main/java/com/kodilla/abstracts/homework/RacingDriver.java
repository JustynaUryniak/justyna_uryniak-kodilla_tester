package com.kodilla.abstracts.homework;

public class RacingDriver extends Job {

    public RacingDriver() {
        super(30000, "Driving a racing car");
    }

    @Override
    public String Responsibility() {
        return getResponsibilities();
    }
}
