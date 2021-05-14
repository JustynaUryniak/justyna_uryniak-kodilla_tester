package com.kodilla.exception.homework;

import java.util.Scanner;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));


        try {
            warehouse.getOrder("5");
            throw new OrderDoesntExistException();

        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, order number does not exist");
        }
    }
}
