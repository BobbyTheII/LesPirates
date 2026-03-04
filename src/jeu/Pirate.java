package jeu;

public enum Pirate {
	CAPITAINE_CROCHET("Capitaine Crochet","violet"),LUFFY("Luffy","jaune")
	,JACK_SPARROW("Jack Sparrow","marron"),FLAMEHEART("Flameheart","rose"),
	VICTOR_MACBERNIK("Victor Macbernik","vert"), JACK_LE_BORGNE("Jack Le Borgne","rouge"),
	BILL_JAMBE_DE_BOIS("Bill Jambe De Bois","bleu");
	
	private String chaine;
	private String couleur;
	
	private Pirate(String chaine,String couleur) {
		this.chaine = chaine;
		this.couleur = couleur;
	}
	
	public String getNom() {
		return chaine;
	}

	@Override
	public String toString() {
		return chaine+ ", le pion de couleur "+couleur+".\n";
	}
}
