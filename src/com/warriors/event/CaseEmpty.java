package com.warriors.event;

import com.warriors.characters.Hero;

public class CaseEmpty implements Event{

    @Override
    public void interact(Hero h) { }

    public String toString(){
        return "You're safe... for now.";
    }

}
