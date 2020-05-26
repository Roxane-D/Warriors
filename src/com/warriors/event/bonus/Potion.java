package com.warriors.event.bonus;

import com.warriors.characters.Hero;

public class Potion extends Bonus {

    public Potion() {
    super(2,0);
    }

    public String toString() {
        return "A Potion !";
    }

    public void interact(Hero h) {
        statsUpdate(h);;
    }
}
