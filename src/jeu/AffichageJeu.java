package jeu;

public class AffichageJeu implements IAffichage{

	public void choisirNom(String joueur) {
		System.out.print("---"+joueur+"---\n"+joueur+", entrez votre nom :");
	}
	
	public void choisirPirate() {
		System.out.print("\nChoississez votre pirate : ");
	}
	
	public void afficherJoueur(String joueur) {
		System.out.println("Au tour du joueur "+joueur);
	}
	
	public void afficherEffet(int effet,int resultat) {
		if(effet == 'C') {
			System.out.println("malheureusement, le pirate est un cochon, sont score est divisé par 2.");
			
		}
		else if(effet == 'T') {
			System.out.println("Grâce a sa découverte précédente, le pirate avance de deux cases de plus");
		}
		System.out.println("Valeur réel des dés : "+resultat);
	}
	
	public void afficherCase(int caseA, String joueur,int nbrVie) {
		System.out.println("\n---DEBUT DE L'ACTION---");
		afficherJoueur(joueur);
		afficherCoeur(nbrVie);
		System.out.println("\nCase Actuelle du joueur : "+caseA+"\n"
				+joueur+" lance les dés !");
	}
		
	public void afficherPirate(int indice,String nom) {
		System.out.print("\n"+indice+") "+ nom);
	}
	
	public void decrireContexteCase(String pirate,int caseA,String description) {
		System.out.println("\nLe pirate "+pirate +" arrive à la case numero :"+caseA);
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
		System.out.println("Bravo ! le joueur "+joueur+" à gagné !\n-------FIN DU JEU------");
	}
	
	public void afficherCaseDuel(String pirate) {
		System.out.println("ARGHH !! le pirate "+pirate+" se prend un grand coup d'épée.\n"
				+ "Il perd une vie, son adversaire s'en empare aussitôt !");
	}
	
	public void afficherMort(String pirate) {
		System.out.println("Malgré sa détermination, le pirate "+pirate+" ne verra plus jamais \nla lumiere du jour...\n"
				+ "Il se sera bien battue. Cette île ne l'oubliera pas.");
	}
	
	public void afficherRecule(String pirate) {
		System.out.println("SAPRISTI ! Je recule !");
	}
	
	public void afficherPirateArrive(String pirate) {
		System.out.println("Le pirate "+pirate+" est arrivé à destination!\n"
				+ "De grandes aventures l'attendent !");
	}
}
