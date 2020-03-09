package com.strategy.person;

public class AssaultRifle implements IAttackBehavior {
    int damage = 75;
    @Override
    public String attack() {
        return "Uses Assault Rifle to attack";
    }

    @Override
    public String damage() {
        return "incurs damage of " + damage + " HP";
    }
}
