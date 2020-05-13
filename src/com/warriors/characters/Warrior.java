package com.warriors.characters;

public class Warrior {
    public String name;
    public int health;
    public int strength;

    public Warrior() {
        name = "Unknown";
        health = 10;
        strength = 10;
    }

    public Warrior(String choosename) {
        name = choosename;
        health = 10;
        strength = 10;
    }

    public Warrior(String choosename, int choosehealth, int choosestrength) {
        name = choosename;
        health = choosehealth;
        strength = choosestrength;
    }

    public String toString() {
        return
                "HERO: " + this.name + "\n" +
                        "HEALTH : " + this.health + "\n" +
                        "STRENGTH : " + this.strength;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
