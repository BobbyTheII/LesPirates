package test;

import jeu.*;
import cases.*;

public class Test_Fonctionnel {
	
	public static void main(String[] args) {
		PlateauJeu plateau = new PlateauJeu();
		Jeu jeuPirate = new Jeu(plateau);
		
		CaseDuel caseDuel = new CaseDuel(0);
		CaseTornade caseTornade = new CaseTornade(0);
		CaseBombe caseB1 = new CaseBombe(2);
		CaseBombe caseB2 = new CaseBombe(19);
		CaseVolcan caseV1 = new CaseVolcan(16);
		CaseSoin caseS2 = new CaseSoin(21);
		CaseSoin caseS1 = new CaseSoin(28);
		CaseCirce caseC1 = new CaseCirce(20);
		CaseTresor caseT1 = new CaseTresor(5);
		
		plateau.ajouterCaseSpeciale(caseTornade, 13);
		plateau.ajouterCaseSpeciale(caseTornade, 22);
		plateau.ajouterCaseSpeciale(caseDuel, 10);
		plateau.ajouterCaseSpeciale(caseDuel, 27);
		plateau.ajouterCaseSpeciale(caseB1, 2);
		plateau.ajouterCaseSpeciale(caseT1, 5);
		plateau.ajouterCaseSpeciale(caseV1, 16);
		plateau.ajouterCaseSpeciale(caseB2, 19);
		plateau.ajouterCaseSpeciale(caseC1, 20);
		plateau.ajouterCaseSpeciale(caseS2, 21);
		plateau.ajouterCaseSpeciale(caseS1,28);
		
		IAffichage affichage = new AffichageJeu();
		jeuPirate.demarrerJeu(affichage);
		
	}
}
