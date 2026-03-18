package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class CaseDuel extends CaseSpeciale{
	
	public CaseDuel(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de) {
		affichage.afficherCaseDuel();
		affichage.afficherJoueur(joueur1.getNom());
		affichage.afficherNextLine();
		joueur1.lancerDe(affichage,de);
		int lance1 = de.getResultat();
		affichage.afficherJoueur(joueur2.getNom());
		affichage.afficherNextLine();
		joueur2.lancerDe(affichage, de);
		int lance2 = de.getResultat();
		if(lance1 > lance2) {
			joueur1.getPion().changerVie(1);
			joueur2.getPion().changerVie(-1);
			affichage.afficherCaseDuelResultat(joueur2.getPion().getPirate().getNom());
		}
		else if(lance1 < lance2) {
			joueur2.getPion().changerVie(1);
			joueur1.getPion().changerVie(-1);
			affichage.afficherCaseDuelResultat(joueur1.getPion().getPirate().getNom());
		}
	}

}
