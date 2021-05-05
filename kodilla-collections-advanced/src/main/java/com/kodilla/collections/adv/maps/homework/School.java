package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();

    public School(int... school) {
        for(int schools : school)
            this.school.add(schools);
    }

    public int getSum() {
        int sum = 0;
        for(int schools : school)
            sum += schools;
        return sum;
    }

    @Override
    public String toString() {
        return "School: " + school.toString();
    }
}

