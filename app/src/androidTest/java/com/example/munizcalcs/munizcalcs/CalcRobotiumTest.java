package com.example.munizcalcs.munizcalcs;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by MUNIZ on 23/03/2018.
 */

public class CalcRobotiumTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo mSolo;

    public CalcRobotiumTest()
    {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception
    {
        mSolo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception
    {
        mSolo.finishOpenedActivities();
    }

    public void testCalcResultOne()
    {
        mSolo.enterText(0,"10");
        mSolo.enterText(1,"5");
        mSolo.clickOnButton("Calc");
        mSolo.waitForText("15");
    }

    public void testCalcResultTwo()
    {
        mSolo.enterText(0,"5");
        mSolo.enterText(1,"5");
        mSolo.clickOnButton("Calc");
        mSolo.waitForText("10");
    }

    public void testCalcResultThree()
    {
        mSolo.enterText(0,"6");
        mSolo.enterText(1,"5");
        mSolo.clickOnButton("Calc");
        mSolo.waitForText("11");
    }

    public void testCalcResultFour()
    {
        mSolo.enterText(0,"6");
        mSolo.enterText(1,"6");
        mSolo.clickOnButton("Calc");
        mSolo.waitForText("12");
    }

    public void testCalcResultFive()
    {
        mSolo.enterText(0,"8");
        mSolo.enterText(1,"5");
        mSolo.clickOnButton("Calc");
        mSolo.waitForText("13");
    }
}










