package com.strategy.person;

public class Person {
    private String name;
    public IAttackBehavior attackBehavior;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String wayOfAttack() {
        return attackBehavior.attack();
    }

    public String amountOfDamage() {
        return attackBehavior.damage();
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
