package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classStudentsQuantity = new ArrayList<>();

    public School(int... classStudentsQuantity) {
        for(int students : classStudentsQuantity)
            this.classStudentsQuantity.add(students);
    }

    public int getSum() {
        int sum = 0;
        for(int students : classStudentsQuantity)
            sum += students;
        return sum;
    }

    @Override
    public String toString() {
        return "Students: " + classStudentsQuantity.toString();
    }
}

