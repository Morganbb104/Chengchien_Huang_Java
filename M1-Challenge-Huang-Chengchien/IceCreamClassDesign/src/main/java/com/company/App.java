package com.company;
//import com.company.factory.IceCream;
//import com.company.pointofsale.IceCream;

public class App {
    public static void main(String[] args) {
        com.company.factory.IceCream chocolateIceCream = new com.company.factory.IceCream("pineapple",6,2,"2022July4th","fruit canes");
        com.company.pointofsale.IceCream IceCream = new com.company.pointofsale.IceCream("chocolate",5,"limited");
    }
}
