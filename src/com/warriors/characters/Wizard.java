package com.warriors.characters;

public class Wizard extends Hero {

    /********************* constructor *********************/
    public Wizard() {
        super("Sorcerer","Merlin", 5, 5, 5, 5 );
    }

    public Wizard(String choosetype) {
        super(choosetype, "Unknown", 5, 5, 5, 5);
    }

    public Wizard(String choosetype, String choosename, int choosehealth, int choosestrength, int chooseattack, int choosedefense) {
        super(choosetype, choosename, choosehealth, choosestrength, chooseattack, choosedefense);
    }

}
