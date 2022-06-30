package com.company;


public class ConverterIf implements Converter {

    public void convertMonth(int monthNumber) {
        if (monthNumber == 1) {
            System.out.println("Jan");
        } else if (monthNumber == 2) {
            System.out.println("Feb");
        } else if (monthNumber == 3) {
            System.out.println("Mar");
        } else if (monthNumber == 4) {
            System.out.println("Apr");
        } else if (monthNumber == 5) {
            System.out.println("May");
        } else if (monthNumber == 6) {
            System.out.println("Jun");
        } else if (monthNumber == 7) {
            System.out.println("Jul");
        } else if (monthNumber == 8) {
            System.out.println("Aug");
        } else if (monthNumber == 9) {
            System.out.println("Sep");
        } else if (monthNumber == 10) {
            System.out.println("Oct");
        } else if (monthNumber == 11) {
            System.out.println("Nov");
        } else if (monthNumber == 12) {
            System.out.println("Dec");

        }
    }

    public void convertDay(int dayNumber){
            if (dayNumber == 1) {
                System.out.println("Sunday");
            } else if (dayNumber == 2) {
                System.out.println("Monday");
            } else if (dayNumber == 3) {
                System.out.println("Tuesday");
            } else if (dayNumber == 4) {
                System.out.println("Wednesday");
            } else if (dayNumber == 5) {
                System.out.println("Thursday");
            } else if (dayNumber == 6) {
                System.out.println("Friday");
            } else if (dayNumber == 7) {
                System.out.println("Saturday");
            } else {
                System.out.println("Wrong number, please type 1 to 7");
            }

        }

}

//            switch (dayNumber) {
//                case 1:
//                    System.out.println("Sunday");//Monday"
//                    break;
//                case 2:
//                    System.out.println("Monday");//Monday
//                    break;
//                case 3:
//                    System.out.println("Tuesday");//Tuesday
//                    break;
//                case 4:
//                    System.out.println("Wednesday");//Wednesday"
//                    break;
//                case 5:
//                    System.out.println("Thursday");//Thursday
//                    break;
//                case 6:
//                    System.out.println("Friday");//Friday
//                    break;
//                case 7:
//                    System.out.println("Saturday");//Saturday
//                    break;
//            }

