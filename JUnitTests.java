package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTests {

    @Test
    /**
     * Test simple addition
     */
    public void additionTestSimple(){
        assertEquals(4, 2+2);
    }

    @Test
    /**
     * Test decimal values
     */
    public void additionTestDecimals(){
        //Delta is the error approximation value
        assertEquals(4.2, 1.25+2.95, 0.01);
    }

    @Test
    /**
     * Test negative values
     */
    public void additionTestNegative(){
        assertEquals(-2, 7+-9);
    }
}
