package com.kodilla.abstracts.homework;

public class TruckDriver extends Job{
    public TruckDriver() {
        super(8000, "Driving a truck");
    }

    @Override
    public String Responsibility() {
        return getResponsibilities();
    }
}
