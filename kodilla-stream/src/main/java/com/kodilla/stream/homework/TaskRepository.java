package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList();
        tasks.add( new Task("Make a report ", LocalDate.of(2021,5,11), LocalDate.of(2021,5,15)));
        tasks.add(new Task("Data collection ", LocalDate.of(2021,5,9), LocalDate.of(2021,5,10)));
        tasks.add(new Task("Defining the rules ", LocalDate.of(2021,5,10), LocalDate.of(2021,5,11)));
        tasks.add(new Task("Consultation", LocalDate.of(2021,5,11), LocalDate.of(2021,5,16)));
        return tasks;
    }
}
