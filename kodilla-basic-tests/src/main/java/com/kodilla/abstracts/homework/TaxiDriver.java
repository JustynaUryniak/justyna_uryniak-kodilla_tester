package com.kodilla.abstracts.homework;

public class TaxiDriver extends Job {
    public TaxiDriver() {
        super(5000, "Driving a Taxi");
    }

    @Override
    public String Responsibility() {
        return getResponsibilities();
    }
}
