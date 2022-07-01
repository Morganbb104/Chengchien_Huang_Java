package com.company;

public abstract class Role {
    peivate String jurisdiction;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getPlowing() {
        return plowing;
    }

    public void setPlowing(int plowing) {
        this.plowing = plowing;
    }

    public int getHarvesting() {
        return harvesting;
    }

    public void setHarvesting(int harvesting) {
        this.harvesting = harvesting;
    }

    //Properties:
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private int plowing;
    private int harvesting;
    //Abilities:
    //attack another character
    abstract public void attack();

}
