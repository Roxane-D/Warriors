package com.warriors;

public class Main {

    public static void main(String[] args) {

	Menu start = new Menu();
	start.chosePlayer();

	Play play = new Play();
	play.playGame();
    }
}
