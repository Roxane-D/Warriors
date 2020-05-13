package com.warriors;

import com.warriors.characters.Warrior;

public class Main {

    public static void main(String[] args) {

	Menu start = new Menu();
	start.chosePlayer();

	Play play = new Play();
	play.playGame();

//		Warrior Perceval = new Warrior();
//		System.out.println(Perceval.name);
//
//		Warrior Bohort = new Warrior("Lolo le numero 10");
//		System.out.println(Bohort.name);
//
//		Warrior Merlin = new Warrior("le magicien", 5, 6);
//		System.out.println(Merlin);

    }
}
