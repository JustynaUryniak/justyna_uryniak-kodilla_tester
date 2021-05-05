package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> institution = new HashMap<>();
        Principal john = new Principal("John Stevenson", "First School");
        Principal jessie = new Principal("Jessie Pinkman", "Second School");
        Principal bart = new Principal("Bart Simpson", "Third School");

        School firstSchool = new School(20,15,17,19);
        School secondSchool = new School(30,25,32,29);
        School thirdSchool = new School(25,20,19,31);

        institution.put(john, firstSchool);
        institution.put(jessie, secondSchool);
        institution.put(bart, thirdSchool);


        for (Map.Entry<Principal, School> principalEntry : institution.entrySet())
        System.out.println("Principal: " + principalEntry.getKey().getNamePrincipal() + ", School name: " + principalEntry.getKey().getNameSchool() + ", Number of students in the class: " + principalEntry.getValue().getSum());





    }
}
