package com.warriors.event.bonus;

import com.warriors.characters.Hero;
import com.warriors.event.Event;

public abstract class Bonus implements Event {

    protected int health;
    protected int strength;

    public Bonus (int health, int strength){
        this.health = health;
        this.strength = strength;
    }

    public void statsUpdate(Hero h){
        h.healthUpdate(this);
        h.strengthUpdate(this);
    }

    public abstract void interact(Hero h);

    /********************* getter *********************/
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

}
