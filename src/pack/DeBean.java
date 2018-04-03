package pack;

import java.util.Random;

public class DeBean {
	protected int valeur;
	protected static final Random RANDOM = new Random();

	public void lancer() {
		valeur = RANDOM.nextInt(6) + 1;
	}

	// --------------------------
	// GUETTERS AND SETTERS
	// ---------------------------

	public int getValeur() {
		return valeur;
	}
}
