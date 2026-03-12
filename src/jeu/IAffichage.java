package jeu;

public interface IAffichage {
	void choisirNom(String joueur);
	void afficherPirate(int indice,String nom);
	void choisirPirate();
	void afficherCreationJoueur(String joueur,String pirate);
	void afficherErreur();
	void afficherCoeur(int nbrVie);
	void afficherEffetActuel(int effet);
	void debuterAction(int caseA,String joueur,int nbrVie,int effet);
	void afficherResultatDes(int de1,int de2);
	void afficherEffet(int effet,int resultat);
	void afficherRecule(String pirate);
	void decrireContexteCase(String pirate,int caseA);
	void afficherJoueur(String joueur) ;
	void afficherResultatDe(int de);
	void afficherCaseDuelResultat(String pirate);
	void afficherMort(String pirate);
	void afficherFinJeu(String joueur);
	void afficherPirateArrive(String pirate);
	void afficherCaseBombe();
	void afficherCaseCirce();
	void afficherCaseDuel();
	void afficherCaseSoin();
	void afficherCaseTornade();
	void afficherCaseTresor();
	void afficherCaseVolcan();
	void afficherCase(int numero);
}
