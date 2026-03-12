package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseTornade extends CaseSpeciale{
	
	public CaseTornade(int numero) {
		super(numero);
	}

	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		affichage.afficherCaseTornade();
		int case1 = joueur1.getPion().getCase();
		int case2 = joueur2.getPion().getCase();
		joueur1.allerA(case2);
		joueur2.allerA(case1);
	}
}
