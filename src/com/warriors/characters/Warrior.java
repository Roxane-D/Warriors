package com.warriors.characters;

public class Warrior extends Hero {
    protected static final int healthMin = 5;
    protected static final int healthMax = 10;
    protected static final int strengthMin = 8;
    protected static final int strengthMax = 15;

    /********************* constructor *********************/
    public Warrior() {

        super("Warrior","Conan", 5, 5);
    }

    public Warrior(String choosetype) {

        super(choosetype, "Unknown", 5, 5);
    }

    public Warrior(String choosetype, String choosename, int choosehealth, int choosestrength) {
        super(choosetype, choosename, choosehealth, choosestrength);
    }

    /********************* methods *********************/
    public String toString() {
        return super.toString();
    }

    @Override
    public int getHealthMin() {
        return Warrior.healthMin;
    }

    @Override
    public int getHealthMax() {
        return Warrior.healthMax;
    }

    @Override
    public int getStrengthMin() {
        return Warrior.strengthMin;
    }

    @Override
    public int getStrengthMax() {
        return Warrior.strengthMax;
    }

}
