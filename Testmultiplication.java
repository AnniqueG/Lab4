package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testmultiplication {

    @Test
    public void multiplication_isCorrect() {
        float actual = Testmultiplication.multiply(2, 4);
        float expected = 8;
        assertEquals(8, 2 * 4);

    }
    public void multiplication_isIncorrect() {
        float actual = Testmultiplication.multiply(2, 4);
        float expected = 10;
        assertEquals(10, 2 * 4);

    }

    private static float multiply(float a, float b) {
        return a * b;
    }


}

