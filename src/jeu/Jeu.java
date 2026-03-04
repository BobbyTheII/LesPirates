package jeu;

import java.util.Scanner;
import cases.*;

public class Jeu {
	private int nbJoueurs;
	private Pion[] pions = new Pion[7];
	private Joueur[] joueurs = new Joueur[2];
	private PlateauJeu plateau;
	
	public Jeu(PlateauJeu plateau) {
		this.plateau = plateau;
		nbJoueurs = 0;
		pions[0] = new Pion(Pirate.CAPITAINE_CROCHET);
		pions[1] = new Pion(Pirate.FLAMEHEART);
		pions[2] = new Pion(Pirate.JACK_SPARROW);
		pions[3] = new Pion(Pirate.LUFFY);
		pions[4] = new Pion(Pirate.VICTOR_MACBERNIK);
		pions[5] = new Pion(Pirate.JACK_LE_BORGNE);
		pions[6] = new Pion(Pirate.BILL_JAMBE_DE_BOIS);
	}
	
	public void creerJoueur(String nom, Pion pion) {
		joueurs[nbJoueurs] = new Joueur(nom,pion);
		nbJoueurs ++;
	}
	
	public int donnerCaseActuelle(Joueur joueur) {
		return joueur.getPion().getCase();
	}
	
	public boolean estFini() {
		boolean fini = false;
		if((donnerCaseActuelle(joueurs[0])==30)||(donnerCaseActuelle(joueurs[1])==30)) {
			fini = true;
		}
		return fini;
	}
	
	public boolean sontATerre() {
		return joueurs[0].getPion().estATerre() || joueurs[1].getPion().estATerre();
	}
	
	public int choisirPirate(IAffichage affichage) {
		int choix = -1;
		for(int i = 0;i<pions.length;i++) {
			if(pions[i].getJoueur()==null) {
				affichage.afficherPirate(i+1,pions[i].getPirate().toString());
			}
			else {
				choix = i+1;
			}
		}
		return choix;
	}
	
	public void demarrerJeu(IAffichage affichage) {
		boolean joueurOK = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<2 && joueurOK;i++) {
			affichage.choisirNom("joueur"+(i+1));
			String nom = sc.nextLine();
			int choixImpossible = choisirPirate(affichage);
			affichage.choisirPirate();
			int choix = sc.nextInt();
			sc.nextLine();
			if(choix>pions.length || choix==choixImpossible || choix <= 0) {
				affichage.afficherErreur();
				joueurOK = false;
			}
			else {
				creerJoueur(nom,pions[choix-1]);
			}
		}
		if(joueurOK) {
			int joueurActuel = 0;
			boolean joueurKO = false;
			boolean jeuFini = false;
			while(!joueurKO && !jeuFini) {
				Joueur joueur = joueurs[joueurActuel];
				int caseA = donnerCaseActuelle(joueur);
				affichage.afficherCase(caseA,joueur.getNom(),joueur.getPion().getVie());
				sc.next();
				int sommeDes = joueur.lancerDes(affichage,plateau.getDe1(),plateau.getDe2());
				joueur.deplacerPion(sommeDes,affichage);
				caseA = donnerCaseActuelle(joueur);
				String pirate = joueur.getPion().getPirate().getNom();
				affichage.decrireContexteCase(pirate,caseA, plateau.getCase(caseA).toString());
				plateau.getCase(caseA).appliquerEffet(affichage,joueurs[0],joueurs[1],plateau.getDe1());
				joueurActuel = (joueurActuel + 1)%2;
				jeuFini = estFini();
				joueurKO = sontATerre();
			}
			if(joueurKO) {
				if(joueurs[0].getPion().estATerre()) {
					affichage.afficherMort(joueurs[0].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[1].getNom());
				}
				else {
					affichage.afficherMort(joueurs[1].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[0].getNom());
				}
			}
			else{
				if(donnerCaseActuelle(joueurs[0])==30) {
					affichage.afficherPirateArrive(joueurs[0].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[0].getNom());
				}
				else {
					affichage.afficherPirateArrive(joueurs[1].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[1].getNom());
				}
			}
			sc.close();
		}
	}
	
}
