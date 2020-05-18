package com.warriors.event.enemies;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Gobelin implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "A Gobelin !";
    }

    public Gobelin(){
        System.out.println("A Gobelin !");
    }
}
