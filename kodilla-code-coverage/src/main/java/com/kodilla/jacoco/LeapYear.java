package com.kodilla.jacoco;

public class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return ((this.year % 4 == 0 && this.year % 100 == 0 && this.year % 400 == 0) || (this.year % 4 == 0 && this.year % 100 != 0));
    }
}


