package test;

import jeu.*;

public class Test_Fonctionnel {
	
	public static void main(String[] args) {
		PlateauJeu plateau = new PlateauJeu();
		Jeu jeuPirate = new Jeu(plateau);
		IAffichage affichage = new AffichageJeu();
		jeuPirate.demarrerJeu(affichage);
	}
}
