package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Kraków", "Poznań"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Poznań", "Szczecin"));
        flights.add(new Flight("Warszawa", "Łódź"));
        return flights;

    }
}

