package com.company;
//import com.company.factory.IceCream;
//import com.company.pointofsale.IceCream;

public class App {
    public static void main(String[] args) {
        com.company.factory.IceCream pineappleIceCream = new com.company.factory.IceCream("pineapple",6,2,"2022July4th","fruit canes");
        com.company.factory.IceCream berryIceCream = new com.company.factory.IceCream("berry",5,3,"2022June4th","fresh fruit");

        com.company.pointofsale.IceCream chocolateIceCream = new com.company.pointofsale.IceCream("chocolate",5,"limited");
        com.company.pointofsale.IceCream almondIceCream = new com.company.pointofsale.IceCream("almond",2,"excellent");
    }
}
