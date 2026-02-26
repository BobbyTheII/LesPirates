package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseSoin extends CaseSpeciale{

	public CaseSoin(int numero) {
		super(numero);
	}
	
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		if(joueur1.getPion().getCase() == numero) {
			joueur1.getPion().changerVie(1);
		}
		else {
			joueur2.getPion().changerVie(1);
		}
	}
	
	@Override
	public String toString() {
		return "Sur cette case rien ne se passe...";
	}
}
