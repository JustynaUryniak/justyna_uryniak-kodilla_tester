package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;
import sun.tools.tree.DivideExpression;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double sum = a + b;
        this.display.display(sum);
        return sum;
    }
    public double subtract(double a, double b) {
        double sub = a - b;
        this.display.display(sub);
        return sub;
    }
    public double multiply(double a, double b) {
        double multi = a * b;
        this.display.display(multi);
        return multi;
    }
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Second number can't be a zero");
        }
        double div = a / b;
        this.display.display(div);
        return div;
    }
}
