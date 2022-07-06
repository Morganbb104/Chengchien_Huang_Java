package com.company;

public class Warrior extends Role {

    int shieldStrength;
    public Warrior(String warriorName) {
        super();
        this.setName(warriorName);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setShieldStrength(100);
        this.setRunning(false);
        this.setArrested(false);
    }



    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public void attack(Role enemy) {
        enemy.setHealth(enemy.getHealth()-this.getAttackPower());
        String name = this.getName();
        System.out.println(name + " successfully attacked " + enemy.getName()+ "." );
//        System.out.println(name + " arrested " + enemy.getName() + "." );

    }

    public void arrest(Role arrestedPerson){
        String name = this.getName();
        System.out.println(name + " arrested " + arrestedPerson.getName() + "." );
    }
}