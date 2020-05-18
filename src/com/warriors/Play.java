package com.warriors;

import com.warriors.characters.Hero;
import com.warriors.event.BoardGame;

import java.util.Scanner;

public class Play {
    private final Hero hero;
    private int board = 64;
    private int playerCase = 0;
    private int turn = 0;

    /********************* constructor *********************/
    public Play(Hero hero){
        this.hero = hero;
    }

    /********************* methods *********************/
    public int dice() {
        int dice = 1 + (int) (Math.random() * 6);
        return dice;
    }


    public void move(int dice) throws OutOfBoard {
        if (playerCase + dice > board) {
            throw new OutOfBoard();
        }
        playerCase += dice;
    }

    public void playGame() {
        BoardGame boardGame = new BoardGame();
        Scanner scanner = new Scanner(System.in);

        while (playerCase < boardGame.boardgame.size()) {
            int newDice = this.dice();
            try {
                move(newDice);
            } catch (OutOfBoard e) {
//                e.printStackTrace();
                System.out.println("YOU PASSED AWAY... TRY AGAIN !");
            }
            turn++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Turn : " + turn +
                    " | Roll Dice : " + newDice +
                    " | Your hero is on the case " + playerCase);
            System.out.println("Press any key to continue.");
            scanner.nextLine();
        }
        System.out.println("YOU ROOOOOOOOOXXXXXXXXX !!!!");
    }
}