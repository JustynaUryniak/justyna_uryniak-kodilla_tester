package com.kodilla.exception.homework;

import java.util.Scanner;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("3"));
        Warehouse.addOrder(new Order("4"));


        try {
            Warehouse.getOrder("5");
            throw new OrderDoesntExistException();

        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, order number does not exist");
        }
    }
}
