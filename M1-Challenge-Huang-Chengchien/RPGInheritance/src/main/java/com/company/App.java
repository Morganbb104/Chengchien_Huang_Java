package com.company;

public class App {
    public static void main(String[] args) {
        Farmer Cheng = new Farmer("Cheng farmer");
        Constable Justin = new Constable("Justin constable");
        Warrior Dan = new Warrior("Dan warrior");

        //Farmer Cheng
        System.out.println(Cheng);
        Cheng.isPlowing(false);
        Cheng.isHarvesting(false);
        Cheng.setRunning(false);
        System.out.println("****************************");

        //Constable Justin
        System.out.println(Justin);
        Justin.setJurisdiction(false);
        Justin.arrest(Dan);
        Justin.attack(Dan);
        System.out.println(Justin);
        System.out.println("****************************");

        //Warrior Dan
        System.out.println(Dan);
        Dan.setShieldStrength(150);
        System.out.println(Dan.getShieldStrength());
        Dan.arrest(Cheng);


    }
}