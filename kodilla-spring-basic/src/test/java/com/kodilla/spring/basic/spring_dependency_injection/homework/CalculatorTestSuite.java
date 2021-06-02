package com.kodilla.spring.basic.spring_dependency_injection.homework;




import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {


    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnSummationResult() {
        Double sum = bean.add(5.5,5.5);

        assertEquals(11, sum, 0.01);
    }

    @Test
    public void shouldReturnSubtractionResult() {
        Double sub = bean.subtract(5.5, 5.5);

        assertEquals(0, sub, 0.01);
    }

    @Test
    public void shouldReturnMultiplicationResult() {
        Double multi = bean.multiply(5.5, 5.5);

        assertEquals(30.25, multi, 0.01);
    }

    @Test
    public void shouldReturnDivisionResult() {
        Double div = bean.divide(5.5, 5.5);

        assertEquals(1, div, 0.01);
    }

    @Test
    public void shouldReturnExceptionWhenDividerIsZero_withException() {

        assertThrows(ArithmeticException.class, () -> bean.divide(5,0), "Second number can't be a zero");
    }

    @Test
    public void shouldReturnNegativeResultFromDivision() {
        Double div = bean.divide(6, -2);

        assertEquals(-3, div, 0.01);
   }
}