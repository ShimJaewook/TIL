package com.junit.example.junitTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator cal;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll method call");
    }

    @BeforeEach
    void setUp() {
        cal = new Calculator();
        System.out.println();
        System.out.println("BeforeEach method call");
    }

    @Test
    void add() {
        assertEquals(12, cal.add(10,2));
    }

    @Test
    void subtract() {
        assertEquals(8, cal.subtract(10,2));
    }

    @Test
    void multiply() {
        assertEquals(20, cal.multiply(10,2));
    }

    @Test
    void divide() {
        assertEquals(5, cal.divide(10,2));
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach method call");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll method call");
    }
}