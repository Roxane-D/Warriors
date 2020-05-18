package com.warriors.event.bonus;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Sledgehammer implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "Take the Sledgehammer !";
    }

    public Sledgehammer(){
        System.out.println("Take the Sledgehammer !");
    }
}
