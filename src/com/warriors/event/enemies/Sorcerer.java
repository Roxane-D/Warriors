package com.warriors.event.enemies;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Sorcerer implements Event {

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "A Sorcerer !";
    }

    public Sorcerer(){
        System.out.println("A Sorcerer !");
    }}
