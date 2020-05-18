package com.warriors.event.bonus;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Sword implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "Draw the Sword !";
    }

    public Sword(){
        System.out.println("Draw the Sword !");
    }
}
