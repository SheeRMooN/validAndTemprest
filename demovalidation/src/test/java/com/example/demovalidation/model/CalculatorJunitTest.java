package com.example.demovalidation.model;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorJunitTest {
    private CalculatorJunit calculator;
    @BeforeEach
    void setUp() {
        calculator =new CalculatorJunit();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void add() {
        Assert.assertEquals(30,calculator.add(10,20));

        Assert.assertTrue(calculator.add(10,10) == 20);
    }

    @Test
    void subtract() {
        long result = calculator.subtract(25, 20);
        Assert.assertEquals(5, result);
    }

    @Test
    void multiply() {
        long result = calculator.multiply(2,5);
        Assert.assertEquals(10,result);
    }

    @Test
    void divide() {
        Assert.assertTrue(2.0 == calculator.divide(10,5));
    }


}