package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Farmer extends Role {
    public Farmer(){
        super();
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        this.setRunning(false);
        this.setArrested(false);

    };
    private boolean plowing = false;
    private boolean harvesting = false;

    public Farmer(boolean plowing, boolean harvesting) {
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    @Override
    public void attack(){
    }
}
