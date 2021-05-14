package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Warehouse {
    public static Set<Order> listOfOrders = new HashSet<>();
    public static void addOrder(Order order) {
        listOfOrders.add(order);
    }
    public static Set<Order> getListOfOrders() {
        return listOfOrders;
    }

     public static Order getOrder(String number) throws OrderDoesntExistException {
         Scanner scanner = new Scanner(System.in);
         while (true) {
             System.out.println("Enter number of order: ");
             String s = scanner.nextLine();
        // jak wywołać Set?
        .stream()
        .filter(o -> o.getNumber().equals(number)
        // jaką metodę zastosować? findAny? findFirst?
        .orElse(OrderDoesntExistException());
        }
     }
}
