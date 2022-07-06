package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable constable;

    @Before
    public void setUp(){
        constable = new Constable("Thomas");
    }

    @Test
    public void attack(){
        Constable Jacob = new Constable();
        Constable.attack(constable("Jacob"));
        int actualOutput = Jacob.getHealth();
        int expectedOutput = 100;
        assertEquals(expectedOutput,actualOutput);
    }

//
//    @Test
//    public void arrest(){
//        Constable constable = new Constable constable("Jacob");
//
//        String expectedOutput = Thomas+"arrested"+"Joe"+".";
//        String actualOutput = "Thomas arrested Joe.";
//        assertEquals(expectedOutput,actualOutput);
//
//    }
    @Test
    public void arrest() {
        Constable Cheng = new Constable();
        Cheng.arrest(constable);
        boolean expectedValue = false;
        boolean actualValue = constable.isArrested();
        assertEquals(expectedValue, actualValue);
}

    private void constable(String jacob) {
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