package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable constable;

    @Before
    public void setUp() {
        constable = new Constable("Stone");
    }
    @Test
    public void whileGotAttackedShouldLose5blood() {
        Constable Cheng = new Constable("Cheng");
        Cheng.attack(constable);
        int actualOutput = constable.getHealth();
        int expectedOutput = 95;
        assertEquals(expectedOutput,actualOutput);

    }



    @Test
    public void whileArrestedShouldReturnFalse() {
        Constable Cheng = new Constable("Cheng");
        Cheng.arrest(constable);
        boolean expectedValue = false;
        boolean actualValue = constable.isArrested();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ReturnTheFalseInisJurisdiction() {
        Constable constable = new Constable();
        constable.isJurisdiction();
        boolean expectedOutput = false;
        boolean actualOutput = constable.isJurisdiction();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void ReturnTheNewValueInsetJurisdiction() {
        Constable constable = new Constable();
        constable.setJurisdiction(true);
        boolean expectedOutput = true;
        boolean actualOutput = constable.isJurisdiction();
        assertEquals(expectedOutput, actualOutput);
    }

}