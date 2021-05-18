package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }
    @Test
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        // then
        assertFalse(isWarsawInUse);
    }
}