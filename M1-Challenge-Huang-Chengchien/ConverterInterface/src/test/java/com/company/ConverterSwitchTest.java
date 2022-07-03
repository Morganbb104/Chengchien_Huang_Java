package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    Converter converterSwitch;
    @Before
    public void setUp() {
        converterSwitch = new ConverterSwitch();
    }
    @Test
    public void shouldReturnMonthFromGivenNumber(){
        assertEquals("January", converterSwitch.convertMonth(1));
        assertEquals("June", converterSwitch.convertMonth(6));
        assertEquals("November", converterSwitch.convertMonth(11));
    }

    @Test
    public void shouldReturnDayFromGivenNumber(){
        assertEquals("Sunday",converterSwitch.convertDay(1));
        assertEquals("Thursday",converterSwitch.convertDay(5));

    }

}