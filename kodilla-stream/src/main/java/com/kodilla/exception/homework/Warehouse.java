package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Warehouse {
    private static Set<Order> listOfOrders = new HashSet<>();

    public static void addOrder(Order order) {
        listOfOrders.add(order);
        System.out.println("Order number: " + order + "has been added");
    }


    public static Order getOrder(String number) throws OrderDoesntExistException {
            System.out.println("Searching number: " + number);
            return listOfOrders
                    .stream()
                    .filter(order -> order.getNumber().equals(order))
                    .findFirst()
                    .orElseThrow(OrderDoesntExistException::new);
        }
    }

