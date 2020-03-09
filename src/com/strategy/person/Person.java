package com.strategy.person;

public class Person {
    private String name;
    public IAttackBehavior attackBehavior;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String wayOfAttack() {
        return attackBehavior.attack();
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
