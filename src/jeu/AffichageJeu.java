package jeu;

public class AffichageJeu implements IAffichage{

	public void choisirNom(String joueur) {
		System.out.print(joueur+", entrez votre nom :");
	}
	
	public void choisirPirate() {
		System.out.println("Choississez votre pirate : ");
	}
	
	public void afficherJoueur(String joueur) {
		System.out.println("Au tour du joueur "+joueur);
	}
	
	public void afficherEffet(int effet,int resultat) {
		if(effet == 'C') {
			System.out.println("malheureusement, le pirate étant un cochon, sont score est divisé par 2.");
			
		}
		else if(effet == 'T') {
			System.out.println("Grace a sa decouverte precedente, le pirate avance de deux cases de plus");
		}
		System.out.println("Valeur réel des des : "+resultat);
	}
	
	public void afficherCase(int caseA, String joueur,int nbrVie) {
		System.out.println("---DEBUT DE L'ACTION---");
		afficherJoueur(joueur);
		afficherCoeur(nbrVie);
		System.out.println("\nCase Actuelle du joueur : "+caseA+"\n"
				+joueur+" lance les dés !");
	}
		
	public void afficherPirate(int indice,String nom) {
		System.out.println(indice+") "+ nom);
	}
	
	public void decrireContexteCase(String pirate,int caseA,String description) {
		System.out.println("\nLe pirate "+pirate +"arrive à la case numero :"+caseA);
		System.out.println("Déscription de la case : "+description);
	}
	
	public void afficherErreur() {
		System.out.println("\nLe joueur n'a pas pu être créé\n"
				+ "\n-------STOP------");
	}
	
	public void afficherResultatDes(int de1,int de2) {
		System.out.println("Resultat du premier de : "+de1+
				"\nResultat du deuxieme de : "+de2+
				"\nPour un total de "+(de1+de2));
	}
	
	public void afficherResultatDe(int de) {
		System.out.println("Resultat du dé : "+de);
	}
	
	public void afficherCoeur(int nbrVie) {
		for(int i = 0;i<nbrVie;i++) {
			System.out.print("❤");
		}
		System.out.print(" "+nbrVie+"\n");
	}
	
	public void afficherFinJeu(String joueur) {
		System.out.println("Bravo ! le joueur "+joueur+" à gagné !");
	}
}
