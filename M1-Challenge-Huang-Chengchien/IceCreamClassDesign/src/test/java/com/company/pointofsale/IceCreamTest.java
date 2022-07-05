package com.company.pointofsale;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Test
    public void buy3GetOneFreeShouldReturn2Over3Price(){
        IceCream iceCream = new IceCream();
        iceCream.setPrice(2);
        double expectedOutput = 1.33;
        double actualOutput = iceCream.buy3GetOneFree();
        assertEquals(expectedOutput,actualOutput,0.01);

    }

    @Test
    public void forCharityShouldReturn20PercentOff(){
        IceCream iceCream = new IceCream();
        iceCream.setPrice(2);
        double expectedOutput = 1.6;
        double actualOutput = iceCream.forCharity();
        assertEquals(expectedOutput,actualOutput,0.01);

    }

    @Test
    public void quantityOnThePackageShouldReturnPrintedQualityString(){
        IceCream iceCream = new IceCream();
        iceCream.setQuantity("Excellent");
        String expectedOutput = "The current quantity is Excellent";
        String actualOutput = iceCream.quantityOnThePackage();
        assertEquals(expectedOutput,actualOutput);

    }



}