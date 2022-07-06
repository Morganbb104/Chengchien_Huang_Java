package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior Dan;
    @Before
    public void setUp() throws Exception {
        Dan= new Warrior("Dan");
    }

    @Test
    public void checkPowerOfShieldStrength() {
        int expectedValue = 100;
        int actualValue = Dan.getShieldStrength();
        assertEquals(expectedValue, actualValue);
    }

}