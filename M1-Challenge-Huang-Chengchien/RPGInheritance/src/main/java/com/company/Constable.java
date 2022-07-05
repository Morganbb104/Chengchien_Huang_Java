package com.company;

public class Constable extends Role {

    public Constable() {
        super();
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setRunning(false);
        this.setArrested(false);
    }
    boolean jurisdiction;

}

