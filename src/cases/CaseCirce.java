package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseCirce extends CaseSpeciale{
	
	public CaseCirce(int numero) {
		super(numero);
	}
	
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		if(joueur1.getPion().getCase() == numero) {
			joueur1.setEffet('C');
		}
		else {
			joueur2.setEffet('C');
		}
	}
	
	@Override
	public String toString() {
		return "Case Circé 🐷 : Circé était sur cette île, \nle pirate a été transformé en cochon : \n"
				+ "le prochain lancé est divisé par deux";
	}
}
