package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable Thomas;

    @Before
    public void setUp(){
        Thomas = new Constable();
    }

    @Test
    public void attack(){
        Warrior Joe = new Warrior("Thomas");
        Thomas.attack(Joe);
        int expectedOutput = Joe.getHealth();
        int actualOutput = 100;
        assertEquals(expectedOutput,actualOutput);



    }

    @Test
    public void arrest(){
        Warrior Joe = new Warrior("Thomas");
        Thomas.arrest(Joe);
        String expectedOutput = Thomas+"arrested"+"Joe"+".";
        String actualOutput = "Thomas arrested Joe.";
        assertEquals(expectedOutput,actualOutput);

    }


}