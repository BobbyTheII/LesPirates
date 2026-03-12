package cases;

import java.util.Scanner;
import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class Case extends CaseSpeciale{
	
	public Case(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de,Scanner sc) {
		affichage.afficherCase(numero);
	}
}
