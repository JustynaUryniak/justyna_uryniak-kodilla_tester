package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(150, LocalDate.of(2021,5,12), "abcd");
    Order order2 = new Order(30, LocalDate.of(2021,3,15), "efgh");
    Order order3 = new Order(55, LocalDate.of(2020,12,5), "ijkl");
    Order order4 = new Order(190, LocalDate.of(2019,3,23), "mnop");
    Order order5 = new Order(23, LocalDate.of(2019,1,12), "1234");
    Order order6 = new Order(123, LocalDate.of(2018,3,23), "5678");

    @Test
    public void shouldAddOrderToShop() {
        int numberOfOrder = shop.getSize();

        assertEquals(6, numberOfOrder);
    }

    @Test
    public void shouldReturnOrdersFromTwoYears() {
        int datesOrder = shop.getOrdersFromTwoYears(LocalDate.of(2018,1,1), LocalDate.of(2020,1,1)).size();

        assertEquals(3, datesOrder);
    }

    @Test
    public void shouldReturnOrdersFromGivenRange() {
        int valuesOrder = shop.getOrdersMinAndMax(30,120).size();

        assertEquals(2, valuesOrder);
    }

    @Test
    public void shouldReturnSumValueOfOrders() {
        double sum = shop.sumOrders();

        assertEquals(571, sum, 0.01);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}