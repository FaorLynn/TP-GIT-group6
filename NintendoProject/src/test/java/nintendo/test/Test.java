package nintendo.test;

import java.util.Collections;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console1 = new Console ("Switch") ;
		Console console2 = new Console ("Wii U") ;
		Console console3 = new Console ("Ordinateur") ;
		
		Adresse adresse1 = new Adresse (1,"rue de Paris", "Lille");
		Boutique boutique1 = new Boutique ("Micromania",adresse1);
		
		Jeu jeu1 = new Jeu ("Metroid", console2,boutique1);
		Jeu jeu2 = new Jeu ("GTA VI", console3, boutique1);
		Jeu jeu3 = new Jeu ("FIFA 2026", console3, boutique1);
		Jeu jeu4 = new Jeu ("Fire EMBLEM", console2, boutique1);
		Jeu jeu5 = new Jeu ("Catapult simulator", console1, boutique1);
		
		Achat a1 =  new Achat(jeu1,"12 octobre 2026",20);
		Achat a2 =  new Achat(jeu4,"15 octobre 2026",59);
		Achat a3 =  new Achat(jeu2,"13 octobre 2026",60);
		Achat a4 =  new Achat(jeu1,"14 octobre 2026",80);
		Achat a5 =  new Achat(jeu5,"21 octobre 2026",5);
		Achat a6 =  new Achat(jeu5,"02 octobre 2026",46);
		
		Client client1 = new Client ("Doe","John");
		
		//Client1.getAchats().add(a1);
		Collections.addAll(client1.getAchats(), a1,a2,a3) ;
		
		//Client Client2 = new Client ("Doe","Jane", achats(Jeu1,"12 octobre 2026",20));
		Client client2 = new Client ("Doe","Jane");
		Collections.addAll(client2.getAchats(), a4,a5,a6) ;
		
		
		
		
		
	}
}
