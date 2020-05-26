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
        statsUpdate(h);
    }

}
