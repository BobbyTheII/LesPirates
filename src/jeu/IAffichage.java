package jeu;

public interface IAffichage {
	void choisirNom(String joueur);
	void afficherPirate(int indice,String nom);
	void choisirPirate();
	void afficherCreationJoueur(String joueur,String pirate);
	void afficherErreur();
	void afficherCoeur(int nbrVie);
	void debuterAction(int caseA,String joueur,int nbrVie);
	void afficherResultatDes(int de1,int de2);
	void afficherEffet(int effet,int resultat);
	void afficherRecule(String pirate);
	void decrireContexteCase(String pirate,int caseA,String description);
	void afficherJoueur(String joueur) ;
	void afficherResultatDe(int de);
	void afficherCaseDuel(String pirate);
	void afficherMort(String pirate);
	void afficherFinJeu(String joueur);
	void afficherPirateArrive(String pirate);
}
