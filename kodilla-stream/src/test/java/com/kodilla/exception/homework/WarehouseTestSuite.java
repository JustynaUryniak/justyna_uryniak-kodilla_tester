package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {
    @Test
    public void testIsNumberOfOrder_withException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("5"),"Sorry, order number does not exist");
    }
}