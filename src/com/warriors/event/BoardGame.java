package com.warriors.event;

import com.warriors.event.bonus.*;
import com.warriors.event.enemies.*;

import java.util.ArrayList;

public class BoardGame {

    int nbCase = 64;
    ArrayList<Event> boardgame;

    public BoardGame(it nbCase) {
        this.nbCase = nbCase;
        this.boardgame = new ArrayList<Event>();

        for (int i = 0; i < nbCase; i++) {
            Event event = switch (i) {
                case 45, 52, 56, 62 -> new Dragon();
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> new Sorcerer();
                case 3, 6, 9, 12, 15, 18, 21, 34, 27, 30 -> new Gobelin();
                case 2, 5, 11, 22, 38 -> new Sledgehammer();
                case 19, 26, 42, 53 -> new Sword();
                case 1, 4, 8, 17, 23 -> new Thunder();
                case 48, 49 -> new FireBall();
                case 7, 13, 31, 33, 39, 43 -> new Potion();
                case 28, 41 -> new PotionMax();
                default -> new CaseEmpty();
            };

            boardgame.add(event);
        }

    }

    /********************* getter *********************/

    public int getNbCase() { return nbCase; }

    public ArrayList<Event> getBoard() { return board; }

    /********************* setter *********************/
    public void setNbCase(int nbCase) { this.nbCase = nbCase; }

    public void setBoard(ArrayList<Event> board) { this.board = board; }

}
