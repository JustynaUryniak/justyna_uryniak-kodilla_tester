package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam Kowalski", new Teacher("Anna Szala")));
        studentList.add(new Student("Piotr Kan", null));
        studentList.add(new Student("Tomasz Brela", new Teacher("Jan Kida")));
        studentList.add(new Student("Anna Makosz", new Teacher("Joanna Kiwa")));
        studentList.add(new Student("Julia Nowak", new Teacher("Janina Bąk")));
        studentList.add(new Student("Gaja Len", null));


        for (Student student : studentList) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
           String teachers = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + ", Teacher: " + teachers);
        }
    }
}
