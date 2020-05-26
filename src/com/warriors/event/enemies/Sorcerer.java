package com.warriors.event.enemies;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Sorcerer extends Enemy implements Event {

    public Sorcerer(){
        super(9,2);
    }

    public String toString(){
        return "A Sorcerer !";
    }

    @Override
    public void interact(Hero h) {
        System.out.println("*** Hey sorcerer. Brint it on ! ***");
    }




}
