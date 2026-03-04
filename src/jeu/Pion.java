package jeu;

public class Pion {
	private Joueur joueur;
	private int caseActuelle = 0;
	private int nbrVie = 5;
	private Pirate pirate;
	
	public Pion(Pirate pirate) {
		this.pirate = pirate;
	}
	
	public int getCase() {
		return caseActuelle;
	}
	
	public void setCase(int nouvelleCase) {
		caseActuelle = nouvelleCase;
	}
	
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	public int getVie() {
		return nbrVie;
	}
	
	public Pirate getPirate() {
		return pirate;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	
	public boolean estATerre() {
		return nbrVie == 0;
	}
	
	public void changerVie(int vie) {
		int newVie = nbrVie + vie;
		if (newVie < 0) {
			newVie = 0;
		}
		else if(newVie > 5) {
			newVie = 5;
		}
		nbrVie = newVie;
	}
}
