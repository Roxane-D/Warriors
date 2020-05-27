package com.warriors.event.bonus;

import com.warriors.characters.Wizard;
import com.warriors.characters.Hero;

public class FireBall extends Bonus {

    public FireBall() {
        super(0, 7);
    }

    public String toString() {
        return "A Fireball ! Put the spell !";
    }

    public void interact(Hero h) {
        if (h instanceof Wizard) {
            System.out.println("Take this fireball Wizard");
            statsUpdate(h);
        } else {
            System.out.println("Don't touch this warrior !");
        }
    }

}
