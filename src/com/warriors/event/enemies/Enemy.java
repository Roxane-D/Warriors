package com.warriors.event.enemies;

import com.warriors.characters.Hero;
import com.warriors.event.Event;

public abstract class Enemy implements Event {

    protected int health;
    protected int strength;

    public Enemy(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public abstract void interact(Hero h);

    /********************* getter *********************/
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    /********************* setter *********************/
    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
