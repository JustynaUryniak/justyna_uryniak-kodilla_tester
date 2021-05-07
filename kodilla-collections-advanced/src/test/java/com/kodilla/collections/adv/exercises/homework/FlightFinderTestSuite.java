package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {

        List<Flight> departures = flightFinder.findFlightsFrom("Poznań");

        List<Flight> expectedList = new ArrayList<>();

        expectedList.add(new Flight("Poznań", "Szczecin"));


        assertEquals(expectedList, departures);
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> arrivals = flightFinder.findFlightsTo("Poznań");

        List<Flight> expectedList = new ArrayList<>();

        expectedList.add(new Flight("Kraków", "Poznań"));


        assertEquals(expectedList, arrivals);
    }

    @Test
    public void shouldReturnNoFlightsIfThereAreNoDeparturesFromTheCity() {
        List<Flight> departures = flightFinder.findFlightsTo("Gdynia");

        List<Flight> expectedList = new ArrayList<>();

        assertEquals(expectedList, departures);
    }

    @Test
    public void shouldReturnNoFlightsIfThereAreNoArrivalsToTheCity() {
        List<Flight> arrivals = flightFinder.findFlightsTo("Warszawa");

        List<Flight> expectedList = new ArrayList<>();

        assertEquals(expectedList, arrivals);
    }
}