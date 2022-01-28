package com.csc205;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // SEAT

        //Setup
        int expected = 4;

        // Exercise
        int actual = new Calculator().add(2, 2);

        // Assertion
        assertEquals(expected, actual);

    }

    @Test
    void testAdd() {

        int expected = 4;
        int actual = new Calculator().add(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {

        int expected = 0;
        int actual = new Calculator().subtract(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {

        int expected = 4;
        int actual = new Calculator().multiply(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    void divide() {

        int expected = 1;
        int actual = new Calculator().divide(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    void divideByZero(){

        assertThrows(ArithmeticException.class, () -> {
            new Calculator().divide(0, 0);
        });
    }
}