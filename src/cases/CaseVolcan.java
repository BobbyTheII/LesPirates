package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseVolcan extends CaseSpeciale{
	
	public CaseVolcan(int numero) {
		super(numero);
	}
	
	@Override 
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		if(joueur1.getPion().getCase()==numero) {
			joueur1.allerA(joueur1.getPion().getCase()-5);
			affichage.afficherRecule(joueur1.getPion().getPirate().getNom());
		}
		else {
			joueur2.allerA(joueur2.getPion().getCase()-5);
			affichage.afficherRecule(joueur2.getPion().getPirate().getNom());
		}
	}
	
	@Override
	public String toString() {
		return "Case Volcan 🌋 : Le volcan entre en éruption ! \n"
				+ "Le pirate bat en retraite et recule de 5 cases";
	}
}
