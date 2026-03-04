package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseBombe extends CaseSpeciale{
	
	public CaseBombe(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		if(joueur1.getPion().getCase() == numero) {
			joueur1.getPion().changerVie(-1);
		}
		else {
			joueur2.getPion().changerVie(-1);
		}
	}
	
	@Override
	public String toString() {
		return "Case Bombe 💣 : Tonnerre de Brest ! La derniere chose que le pirate \nvu avant de s'évanouir "
				+ "aura été un obus \nlancé a toute vitesse en sa direction.\n"
				+ "Il perd une vie.";
	}
}