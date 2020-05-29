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
            System.out.println("TAKE THIS THUNDER WIZARD");
            System.out.println(
                    "      _____\n" +
                    "     /    /\n" +
                    "    /    /\n" +
                    "   /    /\n" +
                    "  /    /____\n" +
                    " /         /\n" +
                    "/_____    /\n" +
                    "     /   /\n" +
                    "    /   /\n" +
                    "   /   /\n" +
                    "  /  /\n" +
                    "  /\n");
            statsUpdate(h);
        } else {
            System.out.println("DON'T TOUCH THIS WARRIOR !");
        }
    }

}
