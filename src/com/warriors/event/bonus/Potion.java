package com.warriors.event.bonus;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Potion implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "A Potion !";
    }

    public Potion(){
        System.out.println("A Potion !");
    }
}
