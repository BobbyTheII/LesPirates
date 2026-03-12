package cases;

import java.util.Scanner;
import jeu.*;

public abstract class CaseSpeciale{
	
	protected int numero;
	
	protected CaseSpeciale(int numero) {
		this.numero = numero;
	}
	
	public abstract void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de,Scanner sc);
}
