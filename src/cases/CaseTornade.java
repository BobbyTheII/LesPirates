package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseTornade extends CaseSpeciale{
	
	public CaseTornade(int numero) {
		super(numero);
	}

	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		int case1 = joueur1.getPion().getCase();
		int case2 = joueur2.getPion().getCase();
		joueur1.allerA(case2);
		joueur2.allerA(case1);
	}
	
	@Override
	public String toString() {
		return "Une tornade apparait soudainement sur le plateau, "
				+ "les deux pirates, emportés par le vent se retrouve respectivement "
				+ "sur la case de l'adversaire !";
	}
}
