package com.strategy.person;

public class ShotGun implements IAttackBehavior {
    private int damagePoints;
    public ShotGun() {
        this.damagePoints = 200;
    }
    public ShotGun(int damagePoints) {
        this.damagePoints = damagePoints;
    }
    @Override
    public String attack() {
        return "Uses Shot Gun to attack";
    }
    @Override
    public String damage() {
        return "incurs damage of " + damagePoints + " HP";
    }

}
