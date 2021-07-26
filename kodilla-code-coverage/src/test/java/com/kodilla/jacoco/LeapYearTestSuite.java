package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTestSuite {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        LeapYear leapYear = new LeapYear(1600);

        boolean isLeapYear = leapYear.isLeap();

        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeNotLeapYear() {

        LeapYear leapYear = new LeapYear(2017);

        boolean isLeapYear = leapYear.isLeap();

        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeNotLeapYearIfNotDivisibleBy400() {

        LeapYear leapYear = new LeapYear(1700);

        boolean isLeapYear = leapYear.isLeap();

        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {

        LeapYear leapYear = new LeapYear(1992);

        boolean isLeapYear = leapYear.isLeap();

        assertTrue(isLeapYear);
    }

}