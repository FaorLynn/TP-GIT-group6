package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console1 = new Console ("Switch") ;
		Console console2 = new Console ("Wii U") ;
		Console console3 = new Console ("Ordinateur") ;
		
		Jeu Jeu1 = new Jeu ("Metroid", console2);
		Jeu Jeu2 = new Jeu ("GTA VI", console3);
		Jeu Jeu3 = new Jeu ("FIFA 2026", console3);
		Jeu Jeu4 = new Jeu ("Fire EMBLEM", console2);
		Jeu Jeu5 = new Jeu ("Catapult simulator", console1);
		
	}

}
