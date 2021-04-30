package com.example.demovalidation.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CalculatorJunit {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(a) / Double.valueOf(b);
        }
        return result;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
