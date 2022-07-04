package com.company.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    @Test
    public void addingTopCream(){
        IceCream iceCream = new IceCream();
        iceCream.addingTopCream();
        double expectedOutput = 2 ;
        double actualOutput = iceCream.getSalePrice();
        assertEquals(expectedOutput,actualOutput,0.01);

    }



}