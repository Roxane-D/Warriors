package com.warriors.event.bonus;

import com.warriors.characters.Hero;
import com.warriors.characters.Warrior;

public class Sword extends Bonus {

    public Sword() {
        super(0, 5);
    }

    public String toString() {
        return "Draw the Sword !";
    }

    public void interact(Hero h) {
        if (h instanceof Warrior) {
            System.out.println("Drop the weapon Warrior.");
            statsUpdate(h);
        }
        System.out.println("Don't touch this wizard !");
    }
}




