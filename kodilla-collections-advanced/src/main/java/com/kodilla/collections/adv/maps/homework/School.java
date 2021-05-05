package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classStudentsQuantity = new ArrayList<>();

    public School(int... classStudentsQuantity) {
        for(int school : classStudentsQuantity)
            this.classStudentsQuantity.add(school);
    }

    public int getSum() {
        int sum = 0;
        for(int school : classStudentsQuantity)
            sum += school;
        return sum;
    }

    @Override
    public String toString() {
        return "School: " + classStudentsQuantity.toString();
    }
}

