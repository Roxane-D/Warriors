package com.warriors.event.bonus;

import com.warriors.characters.Hero;
import com.warriors.characters.Wizard;

public class Thunder extends Bonus {

    public Thunder() {
        super(0, 2);
    }

    public String toString() {
        return "Bring the Thunder !";
    }

    public void interact(Hero h) {
        if (h instanceof Wizard) {
            System.out.println("Take this thunder Wizard");
            statsUpdate(h);
        }
        System.out.println("Don't touch this warrior !");
    }

}
