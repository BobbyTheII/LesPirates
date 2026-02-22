package jeu;

public class Joueur {
	private String nom;
	private Pion pion;
	
	public Joueur(String nom, Pion pion) {
		this.nom = nom;
		this.pion = pion;
		pion.setJoueur(this);
	}
	
	public Pion getPion() {
		return pion;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void deplacerPion(int deplacement) {
		int caseActuelle = pion.getCase();
		int caseFin = caseActuelle + deplacement;
		if(caseFin>30) {
			caseFin = 30 - (caseFin - 30);
		}
		pion.setCase(caseFin);
	}
	
}
