package com.warriors;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void chosePlayer() {
        boolean isReady = false;

        while (!isReady) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Choose your hero (warrior/sorcerer or escap) :");
            String playChoice = scanner.nextLine().toUpperCase();

            switch (playChoice) {
                case "WARRIOR" -> {
                    System.out.println("You are a " + playChoice + ". WAAAAGGGGHHHHH!!!!");
                    isReady = true;
                    Warrior warrior1 = (Warrior) creat(playChoice);
                }
                case "SORCERER" -> {
                    System.out.println("You are a fucking good " + playChoice);
                    isReady = true;
                    Sorcerer sorcerer1 = (Sorcerer) creat(playChoice);
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

    public Object creat(String hero) {
        if (hero.equals("WARRIOR")) {
            Warrior w1 = new Warrior();

            Scanner inputName = new Scanner(System.in);
            System.out.println("Chose your name : ");
            String choosename = inputName.nextLine();
            w1.setName(choosename);

            Scanner inputHealth = new Scanner(System.in);
            System.out.println("Chose your health (5-10) : ");
            int choosehealth = inputHealth.nextInt();
            w1.setHealth(choosehealth);

            Scanner inputStrength = new Scanner(System.in);
            System.out.println("Chose your strength (5-10) : ");
            int choosestrength = inputStrength.nextInt();
            w1.setStrength(choosestrength);

            System.out.println(w1.toString());
            return w1;
        } else {
            Sorcerer w1 = new Sorcerer();

            Scanner inputName = new Scanner(System.in);
            System.out.println("Chose your name : ");
            String choosename = inputName.nextLine();
            w1.setName(choosename);

            Scanner inputHealth = new Scanner(System.in);
            System.out.println("Chose your health (3-6) : ");
            int choosehealth = inputHealth.nextInt();
            w1.setHealth(choosehealth);

            Scanner inputStrength = new Scanner(System.in);
            System.out.println("Chose your strength (8-15) : ");
            int choosestrength = inputStrength.nextInt();
            w1.setStrength(choosestrength);

            System.out.println(w1.toString());
            return w1;

        }
    }
};

