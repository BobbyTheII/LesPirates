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
		if(joueur1.getPion().getCase() == numero) {
			joueur1.setEffet('T');
		}
		else {
			joueur2.setEffet('T');
		}
	}
	
	@Override
	public String toString() {
		return "Case Trésor 💰 : NON D'UNE CREVETTE ! un trésor se trouvait ici \n"
				+ "et personne ne l'avait remarqué : +2 au prochain lancé";
	}

}
