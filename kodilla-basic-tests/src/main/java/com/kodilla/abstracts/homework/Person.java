package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }

    public static void main(String[] args) {

        Person andrzej = new Person("Andrzej", 45, "Bus driver");
        Person damian = new Person("Damian", 25, "Racing driver");
        Person piotr = new Person("Piotr", 34, "Taxi driver");
        Person adam = new Person("Adam", 56, "Truck driver");

        Person[] employee = {andrzej, damian, piotr, adam};


        BusDriver busDriver = new BusDriver();
        busDriver.Responsibility();
        System.out.println("Person "+ employee[0].firstName + " age: "  + employee[0].age + " job: " + employee[0].job + " responsibilities: " + busDriver.Responsibility());

        RacingDriver racingDriver = new RacingDriver();
        racingDriver.Responsibility();
        System.out.println("Person "+employee[1].firstName + " age "  + employee[1].age + " job " + employee[1].job + " responsibilities: " + racingDriver.Responsibility());

        TaxiDriver taxiDriver = new TaxiDriver();
        taxiDriver.Responsibility();
        System.out.println("Person "+employee[2].firstName + " age "  + employee[2].age + " job " + employee[2].job + " responsibilities: " + taxiDriver.Responsibility());

        TruckDriver truckDriver = new TruckDriver();
        truckDriver.Responsibility();
        System.out.println("Person "+employee[3].firstName + " age "  + employee[3].age + " job " + employee[3].job + " responsibilities: " + truckDriver.Responsibility());
    }
}
