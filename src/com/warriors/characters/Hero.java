package com.warriors.characters;

import com.warriors.event.bonus.Bonus;

public abstract class Hero {

    /**
     * Type du Hero
     */
    private String type;
    /**
     * Nom du Hero
     */
    private String name;
    /**
     * Vie du Hero
     */
    private int health;
    /**
     * Force du Hero
     */
    private int strength;

    public abstract int getHealthMin();
    public abstract int getHealthMax();
    public abstract int getStrengthMin();
    public abstract int getStrengthMax();

    /********************* constructor *********************/
    /**
     * Constructeur vide
     */
    public Hero() {

        this("Unknown", "Unknown", 0, 0);
    }

    /**
     * Constructeur avec un argument
     *
     * @param choosetype parametre du type du Hero
     */
    public Hero(String choosetype) {

        this(choosetype, "Unknown", 0, 0);
    }

    /**
     * Constructeur complet
     *
     * @param choosetype     parametre du type du Hero
     * @param choosename     parametre du nom du Hero
     * @param choosehealth   parametre de la vie du Hero
     * @param choosestrength parametre de la force du Hero
     */
    public Hero(String choosetype, String choosename, int choosehealth, int choosestrength) {
        this.type = choosetype;
        this.name = choosename;
        this.health = choosehealth;
        this.strength = choosestrength;

    }

    /**
     * @return
     */
    public String toString() {
        return
                "****************" + this.type + "****************\n" +
                        "NAME : " + this.name + "\n" +
                        "HEALTH : " + this.health + "\n" +
                        "STRENGTH : " + this.strength + "\n" +
                        "****************************************\n";

    }

    /********************* methods *********************/
    public void strengthUpdate(Bonus b) {
        this.setStrength(this.getStrength() + b.getStrength());
    }

    public void healthUpdate(Bonus b) {
        this.setHealth(this.getHealth() + b.getHealth());
    }

    public void healthLose(int lostHealth) {
        if (lostHealth >= this.health) {
            this.health = 0;
        } else {
            this.health -= lostHealth;
        }

    }

    /********************* getter *********************/
    /**
     * retourne le nom du Hero
     *
     * @return le nom sous forme de chaine de caracteres
     */
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    /**
     * retourne le nom du Hero
     *
     * @return le type sous forme de chaine de caracteres
     */
    public String getType() {
        return type;
    }

    /********************* setter *********************/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Met a jour la vie du Hero
     *
     * @param health la nouvelle vie du Hero
     */
    public void setHealth(int health) {
        if (health >= getHealthMin() && health <= getHealthMax()) {
            this.health = health;
        } else if (health > getHealthMax()) {
            this.health = getHealthMax();
        } else {
            this.health = getHealthMin();
        }
    }

    /**
     * Met a jour la force du Hero
     *
     * @param strength la nouvelle force du Hero
     */
    public void setStrength(int strength) {
        if (strength >= getStrengthMin() && strength <= getStrengthMax()) {
            this.strength = strength;
        } else if (strength > getStrengthMax()) {
            this.strength = getStrengthMax();
        } else {
            this.strength = getStrengthMin();
        }
    }

}
