package jeu;

import cases.*;

public class PlateauJeu {
	private int nbCases = 30;
	private int nbCasesSpeciales;
	private De[] des = new De[2];
	private Case[] cases = new Case[30];
	
	public PlateauJeu() {
		nbCasesSpeciales = 0;
		for(int i = 0;i<nbCases;i++) {
			cases[i] = new Case(i+1);
		}
		des[0] = des[1] = new De();
	}
	
	public int getNbCasesSpeciales() {
		return nbCasesSpeciales;
	}
	
	public int lancerDes(IAffichage affichage) {
		 des[0].lancer();
		 des[1].lancer();
		 affichage.afficherResultatDe(des[0].getResultat(),des[1].getResultat());
		 return des[0].getResultat()+ des[1].getResultat();
	}
	
	public void ajouterCaseSpeciale(CaseSpeciale caseS,int numero) {
		nbCasesSpeciales ++;
		cases[numero-1] = caseS;
	}
	
	
}
