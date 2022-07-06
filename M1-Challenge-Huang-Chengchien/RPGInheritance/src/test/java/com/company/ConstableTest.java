package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable Thomas;

    @Before
    public void setUp(){
        Constable Jacob = new Constable();
    }

    @Test
    public void attack(){
        Warrior Jacob = new Warrior("Jacob");
        Thomas.attack(Jacob);
//        System.out.println(Thomas.attack(Jacob));
        int actualOutput = Jacob.getHealth();
        int expectedOutput = 100;
        assertEquals(expectedOutput,actualOutput);}

//
//
//    }

//    @Test
//    public void arrest(){
//        Warrior warrior = new Warrior("Thomas");
//        Thomas.arrest(Joe);
//        String expectedOutput = Thomas+"arrested"+"Joe"+".";
//        String actualOutput = "Thomas arrested Joe.";
//        assertEquals(expectedOutput,actualOutput);
//
//    }


}