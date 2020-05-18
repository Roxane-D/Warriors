package com.warriors.characters;

public class Warrior extends Hero {

    /********************* constructor *********************/
    public Warrior() {

        super("Warrior","Conan", 5, 5, 5, 0 );
    }

    public Warrior(String choosetype) {

        super(choosetype, "Unknown", 5, 5, 5, 5);
    }

    public Warrior(String choosetype, String choosename, int choosehealth, int choosestrength, int chooseattack, int choosedefense) {
        super(choosetype, choosename, choosehealth, choosestrength, chooseattack, choosedefense);
    }

}
