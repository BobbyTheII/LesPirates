package jeu;

import cases.*;

public class PlateauJeu {
	private int nbCases = 30;
	private int nbCasesSpeciales;
	private De[] des = new De[2];
	private CaseSpeciale[] cases = new CaseSpeciale[nbCases];
	
	public PlateauJeu() {
		nbCasesSpeciales = 0;
		for(int i = 0;i<nbCases;i++) {
			cases[i] = new Case(i+1);
		}
		des[0] = new De(6);
		des[1] = new De(6);
		
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
		
		ajouterCaseSpeciale(caseB1, 2);
		ajouterCaseSpeciale(caseT1, 5);
		ajouterCaseSpeciale(caseC2, 6);
		ajouterCaseSpeciale(caseB2, 8);
		ajouterCaseSpeciale(caseD1, 10);
		ajouterCaseSpeciale(caseTo1, 13);
		ajouterCaseSpeciale(caseS1,15);
		ajouterCaseSpeciale(caseV1, 16);
		ajouterCaseSpeciale(caseB3, 17);
		ajouterCaseSpeciale(caseD2, 19);
		ajouterCaseSpeciale(caseC1, 20);
		ajouterCaseSpeciale(caseS2, 21);
		ajouterCaseSpeciale(caseV2, 24);
		ajouterCaseSpeciale(caseT2, 25);
		ajouterCaseSpeciale(caseD3, 27);
		ajouterCaseSpeciale(caseTo2, 28);
		ajouterCaseSpeciale(caseD4, 29);
	}	
	public CaseSpeciale getCase(int numero) {
		return cases[numero-1];
	}
	
	public int getNbCasesSpeciales() {
		return nbCasesSpeciales;
	}
	
	public De getDe1() {
		return des[0];
	}
	
	public De getDe2() {
		return des[1];
	}
	
	public void ajouterCaseSpeciale(CaseSpeciale caseS,int numero) {
		nbCasesSpeciales ++;
		cases[numero-1] = caseS;
	}
	
	
}
