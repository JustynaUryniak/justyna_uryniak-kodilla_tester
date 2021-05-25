package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;

import java.util.*;
import java.util.stream.Collectors;

public class AlarmService {

    private Map<Location, List<Person>> data = new HashMap<>();

    public void addLocations(Location location) {
        this.data.put(location, new ArrayList<>());
    }

    public void addSubscriber(Person person, Location location) {
        for (Map.Entry<Location, List<Person>> locationEntry : data.entrySet()) {
            if (locationEntry.getKey().equals(location)) {
                locationEntry.getValue().add(person);
            }
        }
    }

    public void removeLocation(Location location) {
        data.remove(location);
    }

    public void removeSubscribeFromGivenLocation(Location location, Person person) {
            if (data.containsKey(location)) {
        data.get(location).remove(person);
            }
        }

    public void removeSubscriber(Person person) {
            if (data.containsValue(person)) {
                data.get(person).remove(person);

            }
        }

    public void sendNotificationToAllSubscribes(Notifications notifications) {
        for (Map.Entry<Location, List<Person>> entry : data.entrySet()) {
            entry.getValue().forEach(p -> p.receive(notifications));
        }
    }

    public void sendNotificationToSelectedLocation(Notifications notifications, Location location) {
                if (data.containsKey(location)) {
                    this.data.get(location).forEach(person -> person.receive(notifications));

            }
        }
    }
