package com.company.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    @Test
    public void addingTopCreamShouldReturn2MoreDollars(){
        IceCream iceCream = new IceCream();
        iceCream.addingTopCream();
        double expectedOutput = 2 ;
        double actualOutput = iceCream.getSalePrice();
        assertEquals(expectedOutput,actualOutput,0.01);

    }

    @Test
    public void costShouldBeUnder5USDShouldBeReturnTrue(){
        IceCream iceCream = new IceCream();
        assertEquals(true,iceCream.costShouldBeUnder5USD());
    }

    @Test
    public void promotionShouldBeUnder10USDShouldBeReturnTrue(){
        IceCream iceCream = new IceCream();
        assertEquals(true,iceCream.promotionShouldBeUnder10USD());
    }


}