package com.kodilla.abstracts.homework;

public class BusDriver extends Job {

    public BusDriver() {
        super(3000, "Driving a bus");
    }

    @Override
    public String Responsibility() {
        return getResponsibilities();
    }
}

