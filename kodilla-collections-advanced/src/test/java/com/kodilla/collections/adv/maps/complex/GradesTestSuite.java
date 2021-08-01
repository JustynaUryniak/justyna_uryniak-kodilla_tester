package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GradesTestSuite {


    Map<Student, Grades> school = new HashMap<>();
    Student john = new Student("John", "Stevenson");

    Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);


    @Test
    public void shouldReturnCorrectAverage() {
        school.put(john, johnGrades);
        Grades expected = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);

        assertEquals(expected.getAverage(), school.get(john).getAverage());
    }

}