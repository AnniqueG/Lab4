
package com.example.calculator;

        import org.junit.Test;
        import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void subtraction_isCorrect()
    {
        assertEquals(1, 2-1);
    }
    @Test

    public void subtractionTestDecimals(){

        assertEquals(1.7, 2.95-1.25, 0.01);
    }
    @Test

    public void subTestNegative(){
        assertEquals(-2, 2-4);
    }

}
