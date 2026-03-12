package test;

import jeu.*;
import cases.*;

public class TestFonctionnel {
	
	public static void main(String[] args) {
		PlateauJeu plateau = new PlateauJeu();
		Jeu jeuPirate = new Jeu(plateau);
		
		CaseDuel caseD1 = new CaseDuel(10);
		CaseDuel caseD2 = new CaseDuel(19);
		CaseDuel caseD3 = new CaseDuel(27);
		CaseDuel caseD4 = new CaseDuel(29);
		CaseTornade caseTo1 = new CaseTornade(13);
		CaseTornade caseTo2 = new CaseTornade(28);
		CaseBombe caseB1 = new CaseBombe(2);
		CaseBombe caseB2 = new CaseBombe(8);
		CaseBombe caseB3 = new CaseBombe(17);
		CaseVolcan caseV1 = new CaseVolcan(16);
		CaseVolcan caseV2 = new CaseVolcan(24);
		CaseSoin caseS2 = new CaseSoin(21);
		CaseSoin caseS1 = new CaseSoin(15);
		CaseCirce caseC1 = new CaseCirce(20);
		CaseCirce caseC2 = new CaseCirce(6);
		CaseTresor caseT1 = new CaseTresor(5);
		CaseTresor caseT2 = new CaseTresor(25);
		
		plateau.ajouterCaseSpeciale(caseB1, 2);
		plateau.ajouterCaseSpeciale(caseT1, 5);
		plateau.ajouterCaseSpeciale(caseC2, 6);
		plateau.ajouterCaseSpeciale(caseB2, 8);
		plateau.ajouterCaseSpeciale(caseD1, 10);
		plateau.ajouterCaseSpeciale(caseTo1, 13);
		plateau.ajouterCaseSpeciale(caseS1,15);
		plateau.ajouterCaseSpeciale(caseV1, 16);
		plateau.ajouterCaseSpeciale(caseB3, 17);
		plateau.ajouterCaseSpeciale(caseD2, 19);
		plateau.ajouterCaseSpeciale(caseC1, 20);
		plateau.ajouterCaseSpeciale(caseS2, 21);
		plateau.ajouterCaseSpeciale(caseV2, 24);
		plateau.ajouterCaseSpeciale(caseT2, 25);
		plateau.ajouterCaseSpeciale(caseD3, 27);
		plateau.ajouterCaseSpeciale(caseTo2, 28);
		plateau.ajouterCaseSpeciale(caseD4, 29);		
		
		IAffichage affichage = new AffichageJeu();
		jeuPirate.demarrerJeu(affichage);
		
	}
}
