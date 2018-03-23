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
        int numberA = 9;
        int numberB = 9;
        int expectedValue = 18;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }

    @Test
    public void testResultTwo() throws Exception
    {
        int numberA = 8;
        int numberB = 8;
        int expectedValue = 16;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }

    @Test
    public void testResultThree() throws Exception
    {
        int numberA = 7;
        int numberB = 7;
        int expectedValue = 14;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }

    @Test
    public void testResultFour() throws Exception
    {
        int numberA = 6;
        int numberB = 6;
        int expectedValue = 12;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }

    @Test
    public void testResultFive() throws Exception
    {
        int numberA = 5;
        int numberB = 5;
        int expectedValue = 10;

        double output = Calc.calcResult(numberA, numberB);
        assertEquals(expectedValue, output, DELTA);
    }
}