package com.warriors.event.bonus;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class PotionMax implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "A Maw Potion !";
    }

    public PotionMax(){
        System.out.println("A Max Potion !");
    }
}
