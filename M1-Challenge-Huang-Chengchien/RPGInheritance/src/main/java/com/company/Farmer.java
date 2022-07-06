package com.company;


public class Farmer extends Role {
    private boolean plowing = false;
    private boolean harvesting = false;
    public Farmer(String farmerName){
        super();
        this.setName(farmerName);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        this.setRunning(false);
        this.setArrested(false);

    };


    public Farmer(boolean plowing, boolean harvesting) {
        this.plowing = plowing;
        this.harvesting = harvesting;
    }




    public boolean isPlowing(boolean b) {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting(boolean b) {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }


    @Override
    public void attack(Role enemy){
        enemy.setHealth(enemy.getHealth()-this.getAttackPower());
        String name = this.getName();
        System.out.println(name + " successfully attacked " + enemy.getName()+ "." );
    }

}