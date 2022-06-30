package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        // instantiating from the interface instead of class
        //ConverterIf jan
        //ConverterSwitch
        ConverterIf janSecond =new ConverterIf();
        ConverterSwitch janFirst =new ConverterSwitch();
        janFirst.convertMonth(1);
        janFirst.convertDay(1);
        janSecond.convertMonth(1);
        janSecond.convertDay(2);

    }
}
