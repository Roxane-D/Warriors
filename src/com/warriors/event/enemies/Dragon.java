package com.warriors.event.enemies;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Dragon implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "A Dragon !";
    }

    public Dragon(){
        System.out.println("A Dragon !");
    }
}
