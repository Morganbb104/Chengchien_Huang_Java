package com.company;

public class Constable extends Role {

    boolean jurisdiction;
    public Constable(String constableName) {
        super();
        this.setName(constableName);
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setRunning(false);
        this.setArrested(false);
    }


    public Constable(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    @Override
    public void attack(Role enemy) {
        enemy.setHealth(enemy.getHealth()-this.getAttackPower());
        String name = this.getName();
        System.out.println(name + " successfully attacked " + enemy.getName()+ "." );

    }

    public void arrest(Role arrestedPerson){
        String name = this.getName();
        System.out.println(name + " arrested " + arrestedPerson.getName() + "." );
    }
}
