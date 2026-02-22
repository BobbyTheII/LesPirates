package jeu;

public interface IAffichage {
	String choisirNom(String joueur);
	int choisirPirate(Pion[] pions);
	void afficherContexteCase(int caseA,Joueur joueur);
	int afficherPirate(Pion[] pions);
	void decrireContexteCase(int caseA);
	void afficherErreur();
	void afficherResultatDe(int de1,int de2);
}
