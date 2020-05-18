package com.warriors.event.bonus;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Thunder implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "Bring the Thunder !";
    }

    public Thunder(){
        System.out.println("Bring the Thunder !");
    }
}
