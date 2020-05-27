package com.warriors.characters;

public class Wizard extends Hero {

    protected static final int healthMin = 3;
    protected static final int healthMax = 6;
    protected static final int strengthMin = 8;
    protected static final int strengthMax = 15;

    /********************* constructor *********************/
    public Wizard() {

        super("Wizard", "Merlin", 5, 5);
    }

    public Wizard(String choosetype) {

        super(choosetype, "Unknown", 5, 5);
    }

    public Wizard(String choosetype, String choosename, int choosehealth, int choosestrength) {
        super(choosetype, choosename, choosehealth, choosestrength);
    }

    /********************* methods *********************/
    public String toString() {
        return super.toString();
    }

    @Override
    public int getHealthMin() {
        return Wizard.healthMin;
    }

    @Override
    public int getHealthMax() {
        return Wizard.healthMax;
    }

    @Override
    public int getStrengthMin() {
        return Wizard.strengthMin;
    }

    @Override
    public int getStrengthMax() {
        return Wizard.strengthMax;
    }
}
