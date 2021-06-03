package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnTrueIfWeightIsInTheRange() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean result = bean.deliverPackage("Hill Street 11, New York", 30);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfWeightIsOutOfRange() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean result = bean.deliverPackage("Hill Street 11, New York", 30.5);
        assertFalse(result);
    }

    @Test
    public void shouldReturnCorrectMessageWithSuccessProcess() {
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Hill Street 11, New York");
        assertNotNull(message);
    }

    @Test
    public void shouldReturnCorrectMessageWithFailProcess() {
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("Hill Street 11, New York");
        assertNotNull(message);
    }

    @Test
    public void shouldSendSuccessNotificationIfDataAreCorrect() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Hill Street 11, New York", 0.1);
        assertEquals("Package delivered to: Hill Street 11, New York", message);
    }

    @Test
    public void shouldSendFailNotificationIfDataAreNotCorrect() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Hill Street 11, New York", 50);
        assertEquals("Package not delivered to: Hill Street 11, New York", message);
    }


}