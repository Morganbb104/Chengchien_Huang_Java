package com.company;

public class Warrior extends Role {
    public Warrior() {
        super();
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setRunning(false);
        this.setArrested(false);
    }
    int shieldStrength;

    public Warrior(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public void attack() {

    }
}

