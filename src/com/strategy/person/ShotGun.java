package com.strategy.person;

public class ShotGun implements IAttackBehavior {
    @Override
    public String attack() {
        return "Uses Shot Gun to attack";
    }
}
