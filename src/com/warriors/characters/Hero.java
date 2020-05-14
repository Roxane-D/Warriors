package com.warriors.characters;

public abstract class Hero {
    protected String type;
    protected String name;
    protected int health;
    protected int strength;
    protected int attack;
    protected int defense;

    /********************* constructor *********************/
    public Hero() {
        this("Unknown", "Unknown", 0, 0, 0, 0);
    }

    public Hero(String choosetype) {
        this(choosetype, "Unknown", 0, 0, 0, 0);
    }

    public Hero(String choosetype, String choosename, int choosehealth, int choosestrength, int chooseattack, int choosedefense) {
        this.type = choosetype;
        this.name = choosename;
        this.health = choosehealth;
        this.strength = choosestrength;
        this.attack = chooseattack;
        this.defense = choosedefense;
    }

    public String toString() {
        return
                "****************" + this.type + "****************\n" +
                        "NAME : " + this.name + "\n" +
                        "HEALTH : " + this.health + "\n" +
                        "STRENGTH : " + this.strength + "\n" +
                        "ATTACK : " + this.attack + "\n" +
                        "DEFENSE : " + this.defense + "\n" +
                        "****************************************";

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
