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
        System.out.println("*** HEY DRAGON, BRING IT ON ! ***");
        System.out.println("                                _/|__\n" +
                "            _,-------,        _/ -|  \\_     /~>.\n" +
                "         _-~ __--~~/\\ |      (  \\   /  )   | / |\n" +
                "      _-~__--    //   \\\\      \\ *   * /   / | ||\n" +
                "   _-~_--       //     ||      \\     /   | /  /|\n" +
                "  ~ ~~~~-_     //       \\\\     |( \" )|  / | || /\n" +
                "          \\   //         ||    | VWV | | /  ///\n" +
                "    |\\     | //           \\\\ _/      |/ | ./|\n" +
                "    | |    |// __         _-~         \\// |  /\n" +
                "   /  /   //_-~  ~~--_ _-~  /          |\\// /\n" +
                "  |  |   /-~        _-~    (     /   |/ / /\n" +
                " /   /           _-~  __    |   |____|/\n" +
                "|   |__         / _-~  ~-_  (_______  `\\\n" +
                "|      ~~--__--~ /  _     \\        __\\)))\n" +
                " \\               _-~       |     ./  \\\n" +
                "  ~~--__        /         /    _/     |\n" +
                "        ~~--___/       _-_____/      /\n" +
                "         _____/     _-_____/      _-~\n" +
                "      /^<  ___       -____         -____\n" +
                "         ~~   ~~--__      ``\\--__       ``\\\n" +
                "                    ~~--\\)\\)\\)   ~~--\\)\\)\\)\n");
    }



}
