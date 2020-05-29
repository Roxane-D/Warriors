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
            System.out.println("DROP THE WEAPON WARRIOR.");
            System.out.println("                                                            |\\\n" +
                    "                                                            <<\\         _\n" +
                    "                                                             / \\       //\n" +
                    " _-----------------------------------------------------------{o}______/|\n" +
                    "<       -==============================================:::{*}///////////]\n" +
                    " ------------------------------------------------------------{o}~~~~~~\\|\n" +
                    "                                                             \\ /       \\\\\n" +
                    "                                                            <</         ~\n" +
                    "                                                            |/\n");
            statsUpdate(h);
        }else {
            System.out.println("DON'T TOUCH THIS WIZARD !");
        }
    }
}




