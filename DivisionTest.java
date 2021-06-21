package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.calculator.DivisionTester;

public class DivisionTest {


    @Test
    public void testDivisionWithoutDecimals(){
        double actual = DivisionTester.division(24,3);

        int expected = 8;

        assertEquals("Division without decimals failed", expected, (int) actual, 0);
    }

    @Test
    public void testDivisionWithDecimals(){
        double actual = DivisionTester.division(37,12);

        double expected = 3.08333333333;

        assertEquals("Division with decimals failed", expected, actual, 0.0001);
    }

    @Test
    public void testDivisionWithNegativeNumerator(){
        double actual = DivisionTester.division(-33,11);

        double expected = -3;

        assertEquals("Division with negative numerator failed", expected, (int) actual, 0);
    }

    @Test
    public void testDivisionWithNegativeDenominator(){
        double actual = DivisionTester.division(29,-4);

        double expected = -7.25;

        assertEquals("Division with negative denominator failed", expected, actual, 0.1);

    }

    @Test
    public void testDivisionWithZero(){
        fail("Division with zero failed");


    }
}
