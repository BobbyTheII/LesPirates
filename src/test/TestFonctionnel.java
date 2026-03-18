package test;

import jeu.*;

public class TestFonctionnel {
	
	public static void main(String[] args) {
		Jeu jeuPirate = new Jeu();	

		IAffichage affichage = new AffichageJeu();
		jeuPirate.demarrerJeu(affichage);
	}
}
