package com.strategy.person;

public class ShotGun implements IAttackBehavior {
    int damage = 200;
    @Override
    public String attack() {
        return "Uses Shot Gun to attack";
    }
    public String damage() {
        return "incurs damage of 200 HP";
    }
}
