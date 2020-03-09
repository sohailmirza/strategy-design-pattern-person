package com.strategy.person;

public class Main {
    public static void main(String[] args) {
        Person soldier_1 = new Soldier("Geralt");
        System.out.println("Soldier " + soldier_1.getName() + " " + soldier_1.wayOfAttack());
    }
}
