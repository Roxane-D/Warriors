package com.warriors.event.bonus;

import com.warriors.characters.Wizard;
import com.warriors.characters.Hero;

public class FireBall extends Bonus {

    public FireBall() {
        super(0, 7);
    }

    public String toString() {
        return "A Fireball ! Put the spell !";
    }

    public void interact(Hero h) {
        if (h instanceof Wizard) {
            System.out.println("TAKE THIS FIREBALL WIZARD");
            System.out.println("                             ____\n" +
                    "                     __,-~~/~    `---.\n" +
                    "                   _/_,---(      ,    )\n" +
                    "               __ /        <    /   )  \\___\n" +
                    "- ------===;;;'====------------------===;;;===----- -  -\n" +
                    "                  \\/  ~\"~\"~\"~\"~\"~\\~\"~)~\"/\n" +
                    "                  (_ (   \\  (     >    \\)\n" +
                    "                   \\_( _ <         >_>'\n" +
                    "                      ~ `-i' ::>|--\"\n" +
                    "                          I;|.|.|\n" +
                    "                         <|i::|i|`.\n" +
                    "                         ` ^'\"`-' \"\n");
            statsUpdate(h);
        } else {
            System.out.println("DON'T TOUCH THIS WARRIOR !");
        }
    }

}
