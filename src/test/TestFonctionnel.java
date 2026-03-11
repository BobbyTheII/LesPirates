package test;

import jeu.*;
import cases.*;

public class TestFonctionnel {
	
	public static void main(String[] args) {
		PlateauJeu plateau = new PlateauJeu();
		Jeu jeuPirate = new Jeu(plateau);
		
		CaseDuel caseD1 = new CaseDuel(10);
		CaseDuel caseD2 = new CaseDuel(27);
		CaseTornade caseTo1 = new CaseTornade(8);
		CaseTornade caseTo2 = new CaseTornade(13);
		CaseTornade caseTo3 = new CaseTornade(22);
		CaseBombe caseB1 = new CaseBombe(2);
		CaseBombe caseB2 = new CaseBombe(19);
		CaseBombe caseB3 = new CaseBombe(17);
		CaseVolcan caseV1 = new CaseVolcan(16);
		CaseVolcan caseV2 = new CaseVolcan(24);
		CaseSoin caseS2 = new CaseSoin(21);
		CaseSoin caseS1 = new CaseSoin(28);
		CaseCirce caseC1 = new CaseCirce(20);
		CaseCirce caseC2 = new CaseCirce(6);
		CaseTresor caseT1 = new CaseTresor(5);
		CaseTresor caseT2 = new CaseTresor(25);
		
		plateau.ajouterCaseSpeciale(caseB1, 2);
		plateau.ajouterCaseSpeciale(caseT1, 5);
		plateau.ajouterCaseSpeciale(caseC2, 6);
		plateau.ajouterCaseSpeciale(caseTo1, 8);
		plateau.ajouterCaseSpeciale(caseD1, 10);
		plateau.ajouterCaseSpeciale(caseTo2, 13);
		plateau.ajouterCaseSpeciale(caseV1, 16);
		plateau.ajouterCaseSpeciale(caseB3, 17);
		plateau.ajouterCaseSpeciale(caseB2, 19);
		plateau.ajouterCaseSpeciale(caseC1, 20);
		plateau.ajouterCaseSpeciale(caseS2, 21);
		plateau.ajouterCaseSpeciale(caseTo3, 22);
		plateau.ajouterCaseSpeciale(caseV2, 24);
		plateau.ajouterCaseSpeciale(caseT2, 25);
		plateau.ajouterCaseSpeciale(caseD2, 27);
		plateau.ajouterCaseSpeciale(caseS1,28);
		
		IAffichage affichage = new AffichageJeu();
		jeuPirate.demarrerJeu(affichage);
		
	}
}
