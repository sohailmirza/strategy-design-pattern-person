package com.strategy.person;

public class AssaultRifle implements IAttackBehavior {
    private int damagePoints;
    public AssaultRifle() {
        this.damagePoints = 75;
    }
    public AssaultRifle(int damagePoints) {
        this.damagePoints = damagePoints;
    }
    @Override
    public String attack() {
        return "Uses Assault Rifle to attack";
    }

    @Override
    public String damage() {
        return "incurs damage of " + damagePoints + " HP";
    }
}
