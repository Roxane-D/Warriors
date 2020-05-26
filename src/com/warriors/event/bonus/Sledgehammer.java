package com.warriors.event.bonus;

import com.warriors.characters.Warrior;
import com.warriors.characters.Hero;

public class Sledgehammer extends Bonus {

    public Sledgehammer(){
        super(0,3);
    }

    public String toString(){
        return "Take the Sledgehammer !";
    }

    public void interact(Hero h) {
        if (h instanceof Warrior) {
            System.out.println("Drop the weapon Warrior.");
            statsUpdate(h);
        }
        System.out.println("Don't touch this wizard !");
    }


}
