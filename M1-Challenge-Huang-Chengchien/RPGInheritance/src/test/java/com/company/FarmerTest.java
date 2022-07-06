package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    Farmer Cheng;

    @Before
    public void setUp() throws Exception {
        Cheng = new Farmer();
    }

    @Test
    public void farmerPlowingInAField(){
        Cheng.setPlowing(false);
        assertEquals(false, Cheng.isPlowing(false));
    }
}