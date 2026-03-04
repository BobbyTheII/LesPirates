package jeu;

public class Joueur {
	private String nom;
	private Pion pion;
	private int effet = -1;
	
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
	
	public void setEffet(int effet) {
		this.effet = effet;
	}
	
	public void deplacerPion(int deplacement,IAffichage affichage) {
		int caseActuelle = pion.getCase();
		int caseFin = caseActuelle + deplacement;
		if(caseFin>30) {
			caseFin = 30 - (caseFin - 30);
			affichage.afficherRecule(pion.getPirate().getNom());
		}
		pion.setCase(caseFin);
	}
	
	public void allerA(int deplacement) {
		if ((0<=deplacement)&&(deplacement<=30)) {
			pion.setCase(deplacement);
		}
	}
	
	public int lancerDes(IAffichage affichage,De de1,De de2) {
		de1.lancer();
		de2.lancer();
		affichage.afficherResultatDes(de1.getResultat(),de2.getResultat());
		int resultat = de1.getResultat()+ de2.getResultat();
		if(effet == 'C') {
			resultat = resultat / 2;
			affichage.afficherEffet(effet,resultat);
		}
		else if (effet == 'T') {
			resultat += 2;
			affichage.afficherEffet(effet,resultat);
		}
		effet = -1;
		return resultat;
	}
	
	public int lancerDe(IAffichage affichage,De de) {
		de.lancer();
		affichage.afficherResultatDe(de.getResultat());
		return de.getResultat();
	}
	
}
