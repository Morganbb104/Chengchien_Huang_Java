package com.company;

public class Calculator {
    //add
    public static int add(int x, int y){
        int result = x + y;
        String output =  x+ "+" +y + "=" + result;
        System.out.println( x+ "+" +y + "=" + result );
        return result;}
    public static double add(double x, double y){
        double result = x + y;
        System.out.println( x+ "+" +y + "=" + result );
        return result;}


    //subtract
    public static int subtract(int x, int y){
        int result = x -y;
        System.out.println(x+"-"+y+"="+ result);
        return result;};
    public static double subtract(double x, double y){
        double result = x - y;
        System.out.println(x+"-"+y+"="+result);
        return result;};

    public static int multiply(int x, int y){
        int result = x * y;
        System.out.println(x+"*"+y+"="+result);
        return result;};
    //multiply
    public static double multiply(double x, double y){
        double result = x * y;
        System.out.println(x+"*"+y+"="+result);
        return result;};


    //divide
    public static int divide(int x, int y){
        int result = x / y;
        System.out.println(x+"/"+y+"="+result);
        return result;};
    public static double divide(double x, double y){
        double result = x / y;
        System.out.println(x+"/"+y+"="+result);
        return result;};
}
