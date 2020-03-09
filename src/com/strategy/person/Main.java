package com.strategy.person;

public class Main {
    public static void main(String[] args) {
        Person soldier_1 = new Soldier("Geralt");
        Person soldier_2 = new Soldier("Yennefer");
        soldier_2.setAttackBehavior(new AssaultRifle());
        System.out.println("Soldier " + soldier_1.getName() + " " + soldier_1.wayOfAttack() + " and "
                + soldier_1.amountOfDamage());
        System.out.println("Soldier " + soldier_2.getName() + " " + soldier_2.wayOfAttack() + " and "
                + soldier_2.amountOfDamage());
    }
}
