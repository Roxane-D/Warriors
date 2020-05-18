package com.warriors.event.bonus;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class FireBall implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "A Fireball ! Put a spell !";
    }

    public FireBall(){
        System.out.println("A Fireball ! Put a spell !");
    }
}
