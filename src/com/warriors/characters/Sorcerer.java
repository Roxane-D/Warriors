package com.warriors.characters;

public class Sorcerer extends Hero {

    private String type;

    /********************* constructor *********************/
    public Sorcerer() {
        super("Sorcerer","Merlin", 5, 5, 5, 0 );
    }

    public Sorcerer(String choosetype) {
        super(choosetype, "Unknown", 5, 5, 5, 5);
    }

    public Sorcerer(String choosetype, String choosename, int choosehealth, int choosestrength, int chooseattack, int choosedefense) {
        super(choosetype, choosename, choosehealth, choosestrength, chooseattack, choosedefense);
    }

    /********************* getter *********************/
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getType() { return type; }

    /********************* setter *********************/
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) { this.defense = defense; }

    public void setType(String type) { this.type = type; }
}
