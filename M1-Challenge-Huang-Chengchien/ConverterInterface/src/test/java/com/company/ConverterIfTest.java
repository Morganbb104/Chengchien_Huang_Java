package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    Converter converterIf;
    @Before
    public void setUp()  {
        converterIf = new ConverterIf();
    }

    @Test
    public void shouldReturnMonthFromGivenNumber() {
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("June", converterIf.convertMonth(6));
        assertEquals("December", converterIf.convertMonth(12));
    }

    @Test
    public void shouldReturnDayFromGivenNumber(){
        assertEquals("Sunday", converterIf.convertDay(1));
        assertEquals("Friday", converterIf.convertDay(6));
    }

}