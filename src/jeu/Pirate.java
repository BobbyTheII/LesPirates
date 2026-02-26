package jeu;

public enum Pirate {
	CAPITAINE_CROCHET("Capitaine Crochet","rouge"),LUFFY("Luffy","jaune")
	,JACK_SPARROW("Jack Sparrow","bleu"),FLAMEHEART("Flameheart","rose"),
	VICTOR_MACBERNIK("Victor Macbernik","vert");
	
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
