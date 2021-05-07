package com.kodilla.collections.adv.exercises.homework;



import java.util.*;


public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> departures = new ArrayList<>();
        for (Flight flights : FlightRepository.getFlightsTable()) {
            if (flights.getDeparture().equals(departure)) {
                departures.add(flights);
            }
        }
        if (departures.size() == 0) {
            System.out.println("No flights.");
        }
        return departures;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> arrivals = new ArrayList<>();
        for (Flight flights : FlightRepository.getFlightsTable()) {
            if (flights.getArrival().equals(arrival)) {
                arrivals.add(flights);
            }
        }
        if (arrivals.size() == 0) {
            System.out.println("No flights.");
        }
        return arrivals;
    }
}
