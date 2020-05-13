package com.warriors;

public class Sorcerer {
    public String name;
    public int health;
    public int strength;

    public Sorcerer() {
        name = "Unknown";
        health = 6;
        strength = 15;
    }

    public Sorcerer(String choosename, int choosehealth, int choosestrength) {
        name = choosename;
        health = choosehealth;
        strength = choosestrength;
    }

    public String toString() {
        return
                "Mon héro : " + this.name + "\n" +
                        "Point de vie : " + this.health + "\n" +
                        "Force : " + this.strength;

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