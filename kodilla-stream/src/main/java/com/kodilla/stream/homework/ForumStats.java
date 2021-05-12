package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double average = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() >= 40)
                .map(p -> p.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(average);

        double ave = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() < 40)
                .map(p -> p.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
        System.out.println(ave);
    }
}
