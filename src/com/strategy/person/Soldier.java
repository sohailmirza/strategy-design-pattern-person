package com.strategy.person;

public class Soldier extends Person {
    public Soldier(String name) {
        super(name);
        attackBehavior = new ShotGun();
    }
}
