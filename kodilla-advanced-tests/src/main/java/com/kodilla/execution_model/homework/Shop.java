package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromTwoYears(LocalDate firstDate, LocalDate secondDate) {
        return orders
        .stream()
        .filter(date -> date.getDate().isAfter(firstDate) && date.getDate().isBefore(secondDate))
        .collect(Collectors.toList());
    }

    public List<Order> getOrdersMinAndMax(double min, double max) {
        return orders
                .stream()
                .filter(value -> value.getOrderValue() >= min && value.getOrderValue() <= max)
                .collect(Collectors.toList());
    }

    public int getSize() {
        return this.orders.size();
    }

    public double sumOrders() {
        double value = 0;
        for (Order shop : orders) {
            value += shop.getOrderValue();
        }
        return value;
    }
}
