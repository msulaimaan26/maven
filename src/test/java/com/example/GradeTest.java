package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeTest {

    private GradeCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new GradeCalculator();
    }

    @Test
    public void testGradeF() {
        assertEquals('F', calculator.determineLetterGrade(59));
    }

    @Test
    public void testGradeD() {
        assertEquals('D', calculator.determineLetterGrade(60));
    }

    @Test
    public void testGradeC() {
        assertEquals('C', calculator.determineLetterGrade(75));
    }

    @Test
    public void testGradeB() {
        assertEquals('B', calculator.determineLetterGrade(89));
    }

    @Test
    public void testGradeA() {
        assertEquals('A', calculator.determineLetterGrade(95));
    }

    @Test
    public void testInvalidNegativeGrade() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.determineLetterGrade(-5);
        });
    }

    @Test
    public void testInvalidOverHundredGrade() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.determineLetterGrade(101);
        });
    }
}
