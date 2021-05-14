package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Warehouse {
    private Set<Order> listOfOrders = new HashSet<>();

    public Set<Order> addOrder(Order order) {
        listOfOrders.add(order);
        System.out.println("Order number: " + order + "has been added");
        return listOfOrders;
    }


    public Order getOrder(String number) throws OrderDoesntExistException {
            System.out.println("Searching number: " + number);
            return listOfOrders
                    .stream()
                    .filter(order -> order.getNumber().equals(number))
                    .findFirst()
                    .orElseThrow(OrderDoesntExistException::new);
        }
    }

