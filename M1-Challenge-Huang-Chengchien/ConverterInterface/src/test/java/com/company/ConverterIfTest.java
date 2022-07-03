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
        String expectedOutput = "Jan";
        int actualOutput = ConverterIf.convertMonth(1);
        assertEquals(expectedOutput, actualOutput);
    }

}