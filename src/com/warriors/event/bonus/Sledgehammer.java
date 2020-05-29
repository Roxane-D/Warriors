package com.warriors.event.bonus;

import com.warriors.characters.Warrior;
import com.warriors.characters.Hero;

public class Sledgehammer extends Bonus {

    public Sledgehammer(){
        super(0,3);
    }

    public String toString(){
        return "Take the Sledgehammer !";
    }

    public void interact(Hero h) {
        if (h instanceof Warrior) {
            System.out.println("DROP THE WEAPON WARRIOR.");
            System.out.println("     ___________\n" +
                    "._____l_______l_____.\n" +
                    "||_____/  |  \\_____||\n" +
                    "      /   |   \\\n" +
                    "     /    |    \\\n" +
                    "    /     |     \\\n" +
                    "   /      |      \\\n" +
                    "  /       |       \\\n" +
                    " /        |        \\\n" +
                    "|         |         |\n" +
                    " \\        |        /\n" +
                    "   \\      |      /\n" +
                    "     \\    |    /\n" +
                    "       \\  |  /\n" +
                    "         \\|/\n" +
                    "          `\n");
            statsUpdate(h);
        }else {
            System.out.println("DON'T TOUCH THIS WIZARD !");
        }
    }


}
