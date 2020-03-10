package com.strategy.person;

public class Soldier extends Person {
    private String defenseArea;
    public Soldier(String name) {
        super(name);
        attackBehavior = new ShotGun();
    }
    public void setDefenseArea(String defenseArea) {
        this.defenseArea = defenseArea;
    }
    public String getDefenseArea() {
        return defenseArea;
    }
}
