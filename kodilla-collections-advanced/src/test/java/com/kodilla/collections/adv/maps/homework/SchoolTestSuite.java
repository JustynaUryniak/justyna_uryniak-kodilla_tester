package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolTestSuite {

    @Test
    public void shouldReturnCorrectSum() {
        Map<Principal, School> institution = new HashMap<>();
        Principal john = new Principal("John Stevenson", "First School");
        Principal john1 = new Principal("John Stevenson", "First School");
        School firstSchool = new School(20,15,17,19);
        institution.put(john, firstSchool);

        int johnSchool = firstSchool.getSum();

        assertEquals(71, johnSchool);
        assertEquals(john, john1);



    }
}