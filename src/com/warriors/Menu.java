package com.warriors;

import com.warriors.characters.Hero;
import com.warriors.characters.Wizard;
import com.warriors.characters.Warrior;

import java.util.Scanner;

public class Menu {

    public void chosePlayer() {
        boolean isReady = false;

        while (!isReady) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Choose your hero (warrior/wizard or escap) :");
            String playChoice = scanner.nextLine().toUpperCase();

            switch (playChoice) {
                case "WARRIOR" -> {
                    System.out.println("You are a " + playChoice + ". WAAAAGGGGHHHHH!!!!");
                    isReady = true;
                    Warrior warrior1 = (Warrior) creatHero(playChoice);
                }
                case "WIZARD" -> {
                    System.out.println("You are a fucking good " + playChoice);
                    isReady = true;
                    Wizard wizard1 = (Wizard) creatHero(playChoice);
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
    }

    public Hero creatHero(String hero) {
        if (hero.equals("WARRIOR")) {
            Warrior w1 = new Warrior();
            definiteHero(w1);
            System.out.println(w1.toString());

            return w1;
        } else {
            Wizard w1 = new Wizard();
            definiteHero(w1);
            System.out.println(w1.toString());

            return w1;

        }
    }

    public void definiteHero(Hero h) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Chose your name : ");
        String choosename = inputName.nextLine();
        h.setName(choosename);

        Scanner inputHealth = new Scanner(System.in);
        System.out.println(" chose your health (3-6) : ");
        int choosehealth = inputHealth.nextInt();
        h.setHealth(choosehealth);

        Scanner inputStrength = new Scanner(System.in);
        System.out.println("Chose your strength (8-15) : ");
        int choosestrength = inputStrength.nextInt();
        h.setStrength(choosestrength);
    }
}

