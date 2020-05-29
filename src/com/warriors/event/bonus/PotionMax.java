package com.warriors.event.bonus;

import com.warriors.characters.Hero;

public class PotionMax extends Bonus{

    public PotionMax() {
    super(5,0);
    }

    public String toString() {
        return "A Max Potion !";
    }

    public void interact(Hero h) {
        System.out.println("HEAL YOU HERO !");
        System.out.println(",d88b.d88b,\n" +
                "88888888888\n" +
                "`Y8888888Y'\n" +
                "  `Y888Y'\n" +
                "    `Y'\n");
        statsUpdate(h);
    }

}
