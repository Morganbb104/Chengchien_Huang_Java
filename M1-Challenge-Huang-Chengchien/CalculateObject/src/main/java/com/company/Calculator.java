package com.company;

public class Calculator {
    //add

    public static int add(int x, int y){
     int result = x + y;
        System.out.println( x+ "+" +y + "=" + result );
    return result;}
    public static double add(double x, double y){
        double result = x + y;
        System.out.println( x+ "+" +y + "=" + result );
        return result;}

    //subtract
    public static int subtract(int x, int y){return x - y;};
    public static double subtract(double x, double y){return x - y;};
    public static int multiply(int x, int y){return x * y;};
    //multiply

    public static double multiply(double x, double y){return x * y;};
    //divide
    public static int divide(int x, int y){return x / y;};
    public static double divide(double x, double y){return x / y;};


}
