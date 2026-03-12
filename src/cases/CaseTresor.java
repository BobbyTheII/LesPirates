package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseTresor extends CaseSpeciale{
	
	public CaseTresor(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		affichage.afficherCaseTresor();
		if(joueur1.getPion().getCase() == numero) {
			joueur1.setEffet('T');
		}
		else {
			joueur2.setEffet('T');
		}
	}
}
