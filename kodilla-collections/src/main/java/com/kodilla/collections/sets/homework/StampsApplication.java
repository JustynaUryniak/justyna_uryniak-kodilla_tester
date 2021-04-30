package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Europa", "51 x 39.5", false));
        stamps.add(new Stamp("Kolej", "76.5 x 31.25", false));
        stamps.add(new Stamp("Chińskie znaki zodiaku", "45 x 45", true));
        stamps.add(new Stamp("Kazimierz Górski", "40.50 x 54", true));
        stamps.add(new Stamp("Europa", "51 x 39.5", false));
        stamps.add(new Stamp("Europa", "51 x 39.5", false));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
