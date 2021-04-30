package com.example.demovalidation.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.apache.logging.log4j.ThreadContext.isEmpty;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Tag("One")
class TestHamcrestAndJunit {
    CalculatorJunit cal = null;

    @BeforeEach
    void setUp() {
        cal = new CalculatorJunit();
    }

    @AfterEach
    void tearDown() {
        cal = null;
    }


    @Test
    void TestOne() {
        assertThat(cal.add(3,1) , lessThan(5));
        assertThat(cal.add(3,3) , equalTo(6));
    }


    @Test
    void isEventest(){
        List<Integer> ints = Arrays.asList(10, 20, 30, 40);
        // number
        assertThat(ints, hasSize(4));
        assertThat(ints, hasItems(20,30));
        assertThat(ints, everyItem(greaterThan(0)));
        assertThat(ints, everyItem(lessThan(100)));
        // string
//        assertThat("", isEmpty());
//        assertThat(null, Objects.isNull(null));



    }

}