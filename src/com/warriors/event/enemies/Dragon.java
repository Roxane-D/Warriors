package com.warriors.event.enemies;

import com.warriors.characters.Hero;

public class Dragon extends Enemy{

    public Dragon(){
        super(15,4);
    }

    public String toString(){
        return "A Dragon !";
    }

    @Override
    public void interact(Hero h) {
        System.out.println("*** Hey Dragon, bring it on ! ***");
    }



}
