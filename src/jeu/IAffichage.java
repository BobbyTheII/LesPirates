package jeu;

public interface IAffichage {
	void choisirNom(String joueur);
	void choisirPirate();
	void afficherCase(int caseA,String joueur,int nbrVie);
	void afficherPirate(int indice,String nom);
	void afficherJoueur(String joueur) ;
	void afficherEffet(int effet,int resultat);
	void decrireContexteCase(String pirate,int caseA,String description);
	void afficherErreur();
	void afficherResultatDes(int de1,int de2);
	void afficherResultatDe(int de);
	void afficherCoeur(int nbrVie);
	void afficherFinJeu(String joueur);
	void afficherCaseDuel(String pirate);
	void afficherMort(String pirate);
	void afficherRecule(String pirate);
	void afficherPirateArrive(String pirate);
}
