package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseVolcan extends CaseSpeciale{
	
	public CaseVolcan(int numero) {
		super(numero);
	}
	
	@Override //je suis pas sure
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		if(joueur1.getPion().getCase()==numero) {
			joueur1.allerA(joueur1.getPion().getCase()-5);
		}
		else {
			joueur2.allerA(joueur1.getPion().getCase()-5);
		}
	}
	
	@Override
	public String toString() {
		return "Le volcan entre en éruption";
	}
}
