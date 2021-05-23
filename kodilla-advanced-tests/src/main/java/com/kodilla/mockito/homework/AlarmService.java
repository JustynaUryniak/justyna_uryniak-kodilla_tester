package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;

import java.util.*;

public class AlarmService {

    private Map<Location, List<Person>> data = new HashMap<>();

    public void addLocations(Location location) {
        this.data.put(location, new ArrayList<>());
    }

    public void addSubscriber(Person person, Location location) {
        if (data.containsKey(location)) {
            this.addLocations(location);
    }
        for (Map.Entry<Location, List<Person>> locationEntry : data.entrySet()) {
            if (locationEntry.getKey().equals(location)) {
                locationEntry.getValue().add(person);
                locationEntry.getKey().receiveSubscriber(person);
            }
        }
    }

    public void removeLocation(Location location) {
        for (Map.Entry<Location, List<Person>> locationEntry : data.entrySet()) {
            if (locationEntry.getKey().equals(location)) {
                for (Person person : locationEntry.getValue()) {
                    locationEntry.getKey().removeSubscriber(person);
                }
            }
        }
        data.remove(location);
    }

    public void removeSubscribeFromGivenLocation(Location location, Person person) {
        for (Map.Entry<Location, List<Person>> locationEntry : data.entrySet()) {
            if (locationEntry.getKey().equals(location) && locationEntry.getValue().contains(person)) {
                locationEntry.getValue().remove(person);
                locationEntry.getKey().removeSubscriber(person);
            }
        }
    }

    public void removeSubscriber(Person person) {
        for (Map.Entry<Location, List<Person>> personEntry : data.entrySet()) {
            if (personEntry.getValue().contains(person)) {
                personEntry.getValue().remove(person);
                personEntry.getKey().removeSubscriber(person);
            }
        }
    }

    public void sendNotificationToAllSubscribes(Notifications notifications) {
        for (Map.Entry<Location, List<Person>> entry : data.entrySet()) {
            entry.getValue().forEach(p -> p.receive(notifications));
        }
    }

    public void sendNotificationToSelectedLocation(Notifications notifications, Location location) {
        for (Map.Entry<Location, List<Person>> entry : data.entrySet()) {
            if (entry.getKey().equals(location)) {
                entry.getValue().forEach(p -> p.receive(notifications));
            }
        }
    }


}
