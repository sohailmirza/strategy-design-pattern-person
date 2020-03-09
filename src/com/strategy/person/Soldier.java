package com.strategy.person;

public class Soldier extends Person {
    public Soldier() {
        attackBehavior = new ShotGun();
    }
}
