package cases;

import java.util.Scanner;
import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseCirce extends CaseSpeciale{
	
	public CaseCirce(int numero) {
		super(numero);
	}
	
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de,Scanner sc) {
		affichage.afficherCaseCirce();
		if(joueur1.getPion().getCase() == numero) {
			joueur1.setEffet('C');
		}
		else {
			joueur2.setEffet('C');
		}
	}
}
