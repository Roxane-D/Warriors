package com.warriors;

import com.warriors.characters.Hero;
import com.warriors.characters.Wizard;
import com.warriors.characters.Warrior;

import java.util.Scanner;

public class Menu {

    public String chosePlayer() {
        boolean isReady = false;
        String playChoice = "";

        drawWelcome();

        while (!isReady) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Choose your hero (warrior/wizard or escap) :");
            playChoice = scanner.nextLine().toUpperCase();

            switch (playChoice) {
                case "WARRIOR" -> {
                    System.out.println("You are a " + playChoice + ". WAAAAGGGGHHHHH!!!!");
                    isReady = true;
                }
                case "WIZARD" -> {
                    System.out.println("You are a fucking good " + playChoice);
                    isReady = true;
                }
                case "ESCAP" -> {
                    System.out.println("You escape..? looser");
                    isReady = true;
                }
                default -> System.out.println("Choose better.");
            }
        }
        Scanner start = new Scanner(System.in);
        System.out.println("Press any key to start the game !");
        start.nextLine();
        return playChoice;
    }

    public Hero creatHero() {
        String hero = chosePlayer();
        if (hero.equals("WARRIOR")) {
            Hero w1 = new Warrior();
            definiteHero(w1);
            System.out.println(w1.toString());

            return w1;
        } else {
            Hero w1 = new Wizard();
            definiteHero(w1);
            System.out.println(w1.toString());

            return w1;

        }
    }

    public void definiteHero(Hero h) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Choose your name " + h.getType() + " : ");
        String choosename = inputName.nextLine();
        h.setName(choosename);

        Scanner inputHealth = new Scanner(System.in);
        System.out.println("Choose your health (" + h.getHealthMin() + "-" + h.getHealthMax() + ") : ");
        int choosehealth = inputHealth.nextInt();
        h.setHealth(choosehealth);

        Scanner inputStrength = new Scanner(System.in);
        System.out.println("Choose your strength (" + h.getStrengthMin() + "-" + h.getStrengthMax() + ") : ");
        int choosestrength = inputStrength.nextInt();
        h.setStrength(choosestrength);
    }

    public void drawWelcome(){
        System.out.println(
                "                                       \n" +
                        "             \\                  /\n" +
                        "    _________))                ((__________\n" +
                        "   /.-------./\\\\    \\    /    //\\.--------.\\\n" +
                        "  //#######//##\\\\   ))  ((   //##\\\\########\\\\\n" +
                        " //#######//###((  ((    ))  ))###\\\\########\\\\\n" +
                        "((#######((#####\\\\  \\\\  //  //#####))########))\n" +
                        " \\##' `###\\######\\\\  \\)(/  //######/####' `##/\n" +
                        "  )'    ``#)'  `##\\`->oo<-'/##'  `(#''     `(\n" +
                        "          (       ``\\`..'/''       )\n" +
                        "                     \\\"\"(\n" +
                        "                      `- )\n" +
                        "                      / /\n" +
                        "                     ( /\\\n" +
                        "                     /\\| \\\n" +
                        "                    (  \\\n" +
                        "                        )\n" +
                        "                       /\n" +
                        "                      (\n" +
                        "                      `");

        System.out.println(
                "-_____                                                      ,        -_____                                  \n" +
                        "  ' | -,                _                                  ||          ' | -,          _     _               \n" +
                        " /| |  |` \\\\ \\\\ \\\\/\\\\  / \\\\  _-_   /'\\\\ \\\\/\\\\        _-_  =||=        /| |  |` ,._-_  < \\,  / \\\\  /'\\\\ \\\\/\\\\ \n" +
                        " || |==|| || || || || || || || \\\\ || || || ||       || \\\\  ||         || |==||  ||    /-|| || || || || || || \n" +
                        "~|| |  |, || || || || || || ||/   || || || ||       ||/    ||        ~|| |  |,  ||   (( || || || || || || || \n" +
                        " ~-____,  \\\\/\\\\ \\\\ \\\\ \\\\_-| \\\\,/  \\\\,/  \\\\ \\\\       \\\\,/   \\\\,        ~-____,   \\\\,   \\/\\\\ \\\\_-| \\\\,/  \\\\ \\\\ \n" +
                        "(                      /  \\                                          (                      /  \\             \n" +
                        "                      '----`                                                               '----`            ");

        System.out.println(
                "+-+-+-+ +-+-+-+ +-+-+-+-+ +-+-+-+-+-+\n" +
                        "|L|E|T| |T|H|E| |G|A|M|E| |B|E|G|I|N|\n" +
                        "+-+-+-+ +-+-+-+ +-+-+-+-+ +-+-+-+-+-+");
    }
}

