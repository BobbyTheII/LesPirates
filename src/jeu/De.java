package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class De {
	private int resultat;
	private int face;
	private Random random;
	
	public De(int face) {
		this.face = face;
		try {
			 random = SecureRandom.getInstanceStrong();
		}catch (Exception e) {
			 e.printStackTrace();
		}
	}
	
	public int getResultat() {
		return resultat;
	}
	
	public void lancer() {
		resultat = random.nextInt(face)+1;
	}
}
