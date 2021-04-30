package com.example.demovalidation.model;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class TestHamcrest {
    CalculatorJunit calc;

    @BeforeEach
    public void before() {
        calc = new CalculatorJunit();
    }

    @AfterEach
    public void after() {
        calc = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, 100, 1000})
    void testIsEven(int number) {
        Assertions.assertTrue(calc.isEven(number));
    }

    @ParameterizedTest
    @MethodSource("generateEvenNumbers")
    void testIsEvenRange(int number) {
        Assertions.assertTrue(calc.isEven(number));
    }

    static IntStream generateEvenNumbers() {
        return IntStream.iterate(0, i -> i + 2).limit(50);
    }
}