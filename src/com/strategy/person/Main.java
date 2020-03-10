package com.strategy.person;

public class Main {
    public static void main(String[] args) {
        Person soldier_1 = new Soldier("Akhil");
        Person soldier_2 = new Soldier("Aman");
        soldier_2.setAttackBehavior(new AssaultRifle(500));
        System.out.println("Soldier " + soldier_1.getName() + " " + soldier_1.wayOfAttack() + " and "
                + soldier_1.amountOfDamage());
        System.out.println("Soldier " + soldier_2.getName() + " " + soldier_2.wayOfAttack() + " and "
                + soldier_2.amountOfDamage());
    }
}
