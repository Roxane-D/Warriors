package com.warriors;

import com.warriors.characters.Hero;
import com.warriors.event.enemies.Enemy;

import java.util.Scanner;

public class Combat {

    protected int round = 0;

    enum Status {
        RUN_AWAY,
        ENEMY_DEAD,
        HERO_DEAD
    }

    public Status start(Hero h, Enemy e) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("You want to fight ? (y/n)");
            choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "N" -> {
                    return Status.RUN_AWAY;
                }
                case "Y" -> {
                    round++;
                    System.out.println("Round number : " + round +
                            "\n The enemy has now " + e.getHealth() + " of health.");
                    e.setHealth(e.getHealth() - h.getStrength());
                    System.out.println("You inflicted " + h.getStrength() +
                            "\n The enemy has now " + e.getHealth() + " of health.");

                    if (e.getHealth() > 0) {
                        h.healthLose(e.getStrength());
                        System.out.println("The enemy inflicted you " + e.getStrength());
                        if (h.getHealth() > 0) {
                            System.out.println("\n You have left " + h.getHealth() + " of health.");
                        } else {
                            System.out.println("You passed away...");
                            return Status.HERO_DEAD;
                        }
                    } else {
                        System.out.println("You kill him !");
                        return Status.ENEMY_DEAD;
                    }
                }
            }
        }
    }


}
