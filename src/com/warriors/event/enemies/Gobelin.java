package com.warriors.event.enemies;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Gobelin extends Enemy implements Event {

    public Gobelin(){
        super(6,1);
    }

    public String toString(){
        return "A Gobelin !";
    }

    @Override
    public void interact(Hero h) {
        System.out.println("*** Gobelin... Bring it on ! ***");
    }



}
