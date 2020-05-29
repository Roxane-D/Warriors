package com.warriors;

import com.warriors.characters.Hero;
import com.warriors.event.BoardGame;
import com.warriors.event.Event;
import com.warriors.event.enemies.Enemy;

import java.util.Scanner;

public class Play {
    private final Hero hero;
    private int board = 64;
    private int playerCase = 0;
    private int turn = 0;

    /********************* constructor *********************/
    public Play(Hero hero) {
        this.hero = hero;
    }


    /********************* methods *********************/
    private int dice() {
        int dice = 1 + (int) (Math.random() * 6);
        return dice;
    }


    private void move(int dice) throws OutOfBoard {
        if (playerCase + dice > board) {
            throw new OutOfBoard();
        }
        playerCase += dice;
    }

    private void moveBack(int dice) {
        if (playerCase + dice < 0) {
            playerCase = 0;
        }
        playerCase -= dice;
    }

    public void playGame() {
        BoardGame bg = new BoardGame();
        Scanner scanner = new Scanner(System.in);

        while (playerCase < bg.boardGame.size() - 1) {
            int newDice = this.dice();
            try {
                move(newDice);
            } catch (OutOfBoard e) {
                e.message();
            }

            turn++;

            // Recap de debut de tour
            System.out.println("Turn : " + turn +
                    " | Roll Dice : " + newDice +
                    " | Your hero is on the case " + playerCase
                    + " | " + bg.boardGame.get(playerCase));
            System.out.println("Press any key to continue.");
            scanner.nextLine();

            Event ev = bg.getEvent(playerCase);
            ev.interact(this.hero);
//            scanner.nextLine();
            if (ev instanceof Enemy) {
                Enemy enemy = (Enemy) ev;
                Combat combat = new Combat();
                Combat.Status result = combat.start(hero, enemy);

                switch (result) {
                    case RUN_AWAY -> {
                        System.out.println("Roll the dice !");
                        moveBack(newDice);
                        System.out.println("----------------COWARD----------------\n" +
                                "Move back : " + newDice +
                                " | Your hero is on the case " + playerCase
                                + " | " + bg.boardGame.get(playerCase) + "\n" +
                                "----------------------------------------\n");
                        System.out.println("Press any key to continue.");
                        scanner.nextLine();
                    }
                    case ENEMY_DEAD -> {
                        System.out.println("YOU WON THIS FIGHT !");
                    }
                    case HERO_DEAD -> {
                        System.out.println("G.A.M.E. O.V.E.R.");
                        System.exit(0);
                    }
                }
            }

            System.out.println("****************************************\n" +
                    this.hero.getName() + ", your stats :\n" +
                    "HEALTH : " + this.hero.getHealth() +
                    " | STRENGTH : " + this.hero.getStrength() + "\n" +
                    "****************************************\n");
            System.out.println("Press any key to continue.");
            scanner.nextLine();

        }
        System.out.println(
                "__   _____  _   _   ____   ___   ___   ___   ___   ___   ___   ___   ___   _____  ____  ____  ____  ____  ____  ____  ____  ____  __  _ _ _ _ \n" +
                "\\ \\ / / _ \\| | | | |  _ \\ / _ \\ / _ \\ / _ \\ / _ \\ / _ \\ / _ \\ / _ \\ / _ \\ / _ \\ \\/ /\\ \\/ /\\ \\/ /\\ \\/ /\\ \\/ /\\ \\/ /\\ \\/ /\\ \\/ /\\ \\/ / | | | | |\n" +
                " \\ V / | | | | | | | |_) | | | | | | | | | | | | | | | | | | | | | | | | | | | \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  | | | | |\n" +
                "  | || |_| | |_| | |  _ <| |_| | |_| | |_| | |_| | |_| | |_| | |_| | |_| | |_| /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  /  \\  |_|_|_|_|\n" +
                "  |_| \\___/ \\___/  |_| \\_\\\\___/ \\___/ \\___/ \\___/ \\___/ \\___/ \\___/ \\___/ \\___/_/\\_\\/_/\\_\\/_/\\_\\/_/\\_\\/_/\\_\\/_/\\_\\/_/\\_\\/_/\\_\\/_/\\_\\ (_|_|_|_)");
    }
}