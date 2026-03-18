package jeu;

import java.util.Scanner;

public class AffichageJeu implements IAffichage{
	private Scanner scanner = new Scanner(System.in);

	public String choisirNom(String joueur) {
		System.out.print("---"+joueur+"---\n"+joueur+
				", entrez votre nom :");
		return scanner.nextLine();
	}
	
	public void afficherPirate(int indice,String nom) {
		System.out.print("\n"+indice+") "+ nom);
	}
	
	public int choisirPirate() {
		System.out.print("\nChoississez votre pirate : ");
		return scanner.nextInt();
	}
	
	public void afficherCreationJoueur(String joueur,String pirate) {
		System.out.println("\nLe joueur "+joueur+" entre en jeu avec "+pirate);
	}
	
	public void afficherErreur() {
		System.out.println("\nCe pirate n'existe pas ou plus, réesayez\n"
				+ "\n-------NOUVEL ESSAI------");
	}
	
	public void afficherCoeur(int nbrVie) {
		for(int i = 0;i<nbrVie;i++) {
			System.out.print("❤");
		}
		System.out.print(" "+nbrVie);
	}
	
	public void afficherEffetActuel(int effet) {
		if(effet == 'T') {
			System.out.print(" 💰");
		}
		else if(effet == 'C') {
			System.out.print(" 🐷");
		}
		System.out.println();
	}
	
	public void debuterAction(int caseA, String joueur,int nbrVie,int effet) {
		System.out.println("\n---DEBUT DE L'ACTION---");
		afficherJoueur(joueur);
		afficherCoeur(nbrVie);
		afficherEffetActuel(effet);
		System.out.println("\nCase Actuelle : [ "+caseA+" ]\n"
				+joueur+" lance les dés !");
	}
	
	public void afficherResultatDes(int de1,int de2) {
		System.out.println("     🎲🎲 DES 🎲🎲\nResultat du premier dé : "+de1+
				"\nResultat du deuxieme dé : "+de2+
				"\nPour un total de "+"( "+(de1+de2)+" ).");
	}
	
	public void afficherEffet(int effet,int resultat) {
		if(effet == 'C') {
			System.out.println("Malheureusement, le pirate est un cochon, "
					+ "sont score est divisé par 2.");
			
		}
		else if(effet == 'T') {
			System.out.println("Grâce a sa découverte précédente, "
					+ "le pirate avance de deux cases de plus.");
		}
		System.out.println("Valeur réel des dés : ( "+resultat+" ).");
	}
	
	public void afficherRecule(String pirate) {
		System.out.println(pirate+" : \"SAPRISTI ! Je recule !\"");
	}
	
	public void decrireContexteCase(String pirate,int caseA) {
		System.out.println("\n   -🎴-CASE FINAL-🎴-\nLe pirate "+pirate +
				" arrive sur la case numero : [ "+caseA+" ] .");
		System.out.print("{ Déscription de la case } : ");
	}	
	
	public void afficherJoueur(String joueur) {
		System.out.println("Au tour du joueur "+joueur+" :");
	}
		
	public void afficherResultatDe(int de) {
		System.out.println("Resultat du dé : "+de);
	}
	
	public void afficherPoisition(int numeroCase,String pirate) {
		System.out.println("Le pirate "+pirate+" est maintenant sur la case : [ "+numeroCase+" ] .");
	}
	
	public void afficherCaseDuelResultat(String pirate) {
		System.out.println("ARGHH !! le pirate "+pirate+" se prend un grand coup "
				+ "d'épée.\nIl perd une vie, son adversaire s'en empare aussitôt !");
	}
	
	public void afficherMort(String pirate) {
		System.out.println("Malgré sa détermination, le pirate "+pirate+
				" ne verra plus jamais la lumiere du jour...\n"
				+ "Cette île sera son tombeau.");
		System.out.println(pirate+" : \" J-je me vengerai.... \" \n");
	}
	
	public void afficherFinJeu(String joueur) {
		System.out.println("Bravo ! le joueur "+joueur+" a gagné !\n"
				+ "-------FIN DU JEU------");
	}
		
	public void afficherPirateArrive(String pirate) {
		System.out.println("Le pirate "+pirate+" est arrivé à destination!\n"
				+ "De grandes aventures l'attendent !");
		System.out.println(pirate+" : \" Îl(e) était temps ! \"");
	}
	
	public void afficherCaseBombe() {
		System.out.println("Case Bombe 💣 : Tonnerre de Brest ! Une bombe explose à 5m du ou des pirate(s).\n"
				+ "Une vie est enlevé.");
	}
	
	public void afficherCaseCirce() {
		System.out.println("Case Circé 🐷 : Circé était sur cette île, \nle pirate a été transformé en cochon : \n"
				+ "le prochain lancé est divisé par deux.");
	}
	
	public void afficherCaseDuel() {
		System.out.println("Case Duel ⚔ : Les deux pirates vont devoir s'affronter ! \n"
				+ "Le gagnant remporte une vie de son adversaire.");
		System.out.println("     -🎲 DE 🎲-");
	}
	
	public void afficherCaseSoin() {
		System.out.println("Case Soin 💊 : SACREBLEU !Le pirate aperçoit un kit de premier secours, echoué près de lui.\n"
				+ "Il regagne une vie.");
	}
	
	public void afficherCaseTornade() {
		System.out.println("Case Tornade 🌪️ : Une tornade apparait soudainement sur l'île.\n"
				+ "Les deux pirates, emportés par le vent, \nse retrouvent respectivement "
				+ "sur la case de son adversaire !");
	}
	
	public void afficherCaseTresor() {
		System.out.println("Case Trésor 💰 : NON D'UNE CREVETTE ! un trésor se trouvait ici "
				+ "et personne ne l'avait remarqué : \n+2 au prochain lancé.");
	}
	
	public void afficherCaseVolcan() {
		System.out.println("Case Volcan 🌋 : Le volcan entre en éruption ! \n"
				+ "Le pirate bat en retraite et recule de 5 cases.");
	}
	
	public void afficherCase(int numero) {
		if (numero == 30) {
			System.out.println("Dernière case du plateau 👑 : vous avez gagné !"); 
		}
		else{
			System.out.println("Sur cette case rien ne se passe...🍂");
		}
	}
	
	public void afficherNextLine() {
		scanner.nextLine();
	}
}
