package com.example.munizcalcs.munizcalcs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private static final double DELTA = 0.001;

    @Test
    public void testResultOne() throws Exception
    {
        int numberA = 5;
        int numberB = 5;
        int expectedValue = 10;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }

    @Test
    public void testResultTwo() throws Exception
    {
        int numberA = 15;
        int numberB = 2;
        int expectedValue = 17;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }

}