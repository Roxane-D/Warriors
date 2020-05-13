package com.warriors;

import java.util.Scanner;

public class Play {
    int board = 64;
    int playerCase = 0;
    int turn = 0;

    public int dice() {
        int dice = 1 + (int) (Math.random() * 6);
        return dice;
    }

    public void playGame() {
        while (playerCase < board) {
            int newDice = this.dice();
            playerCase += newDice;
            turn++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Turn : " + turn +
                    " | Roll Dice : " + newDice +
                    " | Your hero is on the case " + playerCase);
            System.out.println("Press any key to continue.");
            scanner.nextLine();
        }
        System.out.println("YOU WON !!!!");
    }
}