package jeu;

import java.util.Scanner;

public class Jeu {
	private int nbJoueurs;
	private Pion[] pions = new Pion[5];
	private Joueur[] joueurs = new Joueur[2];
	private PlateauJeu plateau;
	
	public Jeu(PlateauJeu plateau) {
		this.plateau = plateau;
		nbJoueurs = 0;
		pions[0] = new Pion(Pirate.CAPITAINE_CROCHET);
		pions[1] = new Pion(Pirate.FLAMEHEART);
		pions[2] = new Pion(Pirate.JACK_SPARROW);
		pions[3] = new Pion(Pirate.LUFFY);
		pions[4] = new Pion(Pirate.VICTOR_MACBERNIK);
	}
	
	public void creerJoueur(String nom, Pion pion) {
		joueurs[nbJoueurs] = new Joueur(nom,pion);
		nbJoueurs ++;
	}
	
	public int donnerCaseActuelle(Joueur joueur) {
		return joueur.getPion().getCase();
	}
	
	public boolean estFini() {
		boolean fini = false;
		if((donnerCaseActuelle(joueurs[0])==30)||(donnerCaseActuelle(joueurs[1])==30)) {
			fini = true;
		}
		return fini;
	}
	
	public void demarrerJeu(IAffichage affichage) {
		boolean joueurOK = true;
		for(int i = 0;i<2 && joueurOK;i++) {
			String nom = affichage.choisirNom("joueur"+(i+1));
			int choix = affichage.choisirPirate(pions);
			if(choix<0) {
				affichage.afficherErreur();
				joueurOK = false;
			}
			else {
				creerJoueur(nom,pions[choix-1]);
			}
		}
		int joueurActuel = 0;
		boolean joueurKO = false;
		boolean jeuFini = false;
		Scanner sc = new Scanner(System.in);
		while(!joueurKO && !jeuFini) {
			int caseA = donnerCaseActuelle(joueurs[joueurActuel]);
			affichage.afficherContexteCase(caseA,joueurs[joueurActuel]);
			sc.next();
			int deplacement = plateau.lancerDes(affichage);
			joueurs[joueurActuel].deplacerPion(deplacement);
			affichage.decrireContexteCase(joueurs[joueurActuel].getPion().getCase());
			joueurActuel = (joueurActuel + 1)%2;
			jeuFini = estFini();
			joueurKO = joueurs[0].getPion().estATerre() || joueurs[1].getPion().estATerre();
		}
	}
	
}
