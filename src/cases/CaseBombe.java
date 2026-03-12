package cases;

import java.util.Scanner;
import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseBombe extends CaseSpeciale{
	
	public CaseBombe(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de,Scanner sc) {
		affichage.afficherCaseBombe();
		if(joueur1.getPion().getCase() == numero) {
			joueur1.getPion().changerVie(-1);
		}
		else {
			joueur2.getPion().changerVie(-1);
		}
	}
}