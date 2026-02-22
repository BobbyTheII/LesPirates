package jeu;

import java.util.Scanner;

public class AffichageJeu implements IAffichage{

	public void afficherContexteCase(int caseA, Joueur joueur) {
		System.out.println("\nCase Actuelle du joueur "+joueur.getNom()+": "+caseA+"\n"
				+ joueur.getNom()+" à toi !\n");
	}
	
	public String choisirNom(String joueur) {
		System.out.println(joueur+", entrez votre nom :");
		Scanner sc = new Scanner(System.in);
		String nom = sc.nextLine();
		return nom;
	}
	
	public int choisirPirate(Pion[] pions) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choississez votre pirate : \n");
		int choixImpossible = afficherPirate(pions);		
		int choix = sc.nextInt();
		if(choix<6 && choix!=choixImpossible) {
			return choix;
		}
		System.out.println("Aucun pirate de ce nom...\n");
		return -1;
	}
	
	public int afficherPirate(Pion[] pions) {
		int choix = -1;
		for(int i = 0;i<pions.length;i++) {
			if(pions[i].getJoueur()==null) {
				System.out.println((i+1)+") "+pions[i].getPirate());
			}
			else {
				choix = i+1;
			}
		}
		return choix;
	}
	
	public void decrireContexteCase(int caseA) {
		System.out.println("\nArrivé à la case numero :"+caseA+"\n");
	}
	
	public void afficherErreur() {
		System.out.println("Le joueur n'a pas pu être créé\n"
				+ "\n-------STOP------");
	}
	
	public void afficherResultatDe(int de1,int de2) {
		System.out.println("Resultat du premier de : "+de1+
				"\nResultat du deuxieme de : "+de2+
				"\nPour un total de "+(de1+de2)+"\n");
	}
}
