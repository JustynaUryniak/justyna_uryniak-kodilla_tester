package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class AlarmServiceTestSuite {

    AlarmService alarmService =  new AlarmService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Notifications notifications = Mockito.mock(Notifications.class);


    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        alarmService.sendNotificationToAllSubscribes(notifications);
        Mockito.verify(person, Mockito.never()).receive(notifications);
    }

    @Test
        public void subscribedClientShouldReceiveNotificationFromTheSelectedLocation() {
        alarmService.addLocations(location);
        alarmService.addSubscriber(person, location);
        alarmService.sendNotificationToSelectedLocation(notifications, location);


       // Mockito.verify(location, Mockito.times(1)).receiveSubscriber(person);
        Mockito.verify(person, Mockito.times(1)).receive(notifications);
    }

    @Test
    public void ClientWhoUnsubscribedLocationShouldNotReceiveNotificationFromSelectedLocation() {
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        alarmService.addLocations(location);
        alarmService.addLocations(location1);
        alarmService.addLocations(location2);
        alarmService.addSubscriber(person, location);
        alarmService.addSubscriber(person, location1);
        alarmService.addSubscriber(person, location2);
        alarmService.removeSubscribeFromGivenLocation(location, person);


        alarmService.sendNotificationToSelectedLocation(notifications, location);
        Mockito.verify(person, Mockito.never()).receive(notifications);
       // Mockito.verify(location1, Mockito.times(1)).receiveSubscriber(person);
       // Mockito.verify(location2, Mockito.times(1)).receiveSubscriber(person);
       // Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotificationFromAnyLocation() {
        alarmService.addSubscriber(person, location);
        alarmService.removeSubscriber(person);

        alarmService.sendNotificationToAllSubscribes(notifications);
        Mockito.verify(person, Mockito.never()).receive(notifications);

    }

    @Test
    public void ClientWhoUnsubscribedAllLocationShouldNotReceiveNotification() {
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        alarmService.addLocations(location);
        alarmService.addLocations(location1);
        alarmService.addSubscriber(person, location);
        alarmService.addSubscriber(person, location1);
        alarmService.removeSubscribeFromGivenLocation(location, person);
        alarmService.removeSubscribeFromGivenLocation(location1, person);

        alarmService.sendNotificationToSelectedLocation(notifications, location);
        alarmService.sendNotificationToSelectedLocation(notifications, location1);
        Mockito.verify(person, Mockito.never()).receive(notifications);
       /// Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
    }

    @Test
    public void shouldSendNotificationForPeopleFromGivenLocation() {
        Person person1 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        alarmService.addLocations(location);
        alarmService.addLocations(location1);
        alarmService.addSubscriber(person, location);
        alarmService.addSubscriber(person1, location1);

        alarmService.sendNotificationToSelectedLocation(notifications, location);
        alarmService.sendNotificationToSelectedLocation(notifications, location1);
        Mockito.verify(person, Mockito.times(1)).receive(notifications);
        Mockito.verify(person1, Mockito.times(1)).receive(notifications);

    }

    @Test
    public void shouldNotSendNotificationFromRemoveLocation() {
        alarmService.addLocations(location);
        alarmService.addSubscriber(person, location);
        alarmService.removeLocation(location);
        alarmService.sendNotificationToSelectedLocation(notifications, location);
        Mockito.verify(person, Mockito.never()).receive(notifications);


    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        alarmService.addLocations(location);
        alarmService.addLocations(location1);
        alarmService.addLocations(location2);
        alarmService.addSubscriber(person, location);
        alarmService.addSubscriber(secondPerson, location1);
        alarmService.addSubscriber(thirdPerson, location2);

        alarmService.sendNotificationToAllSubscribes(notifications);
        Mockito.verify(person, Mockito.times(1)).receive(notifications);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(notifications);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(notifications);
    }
}

