package pack;

public class JoueurBean {
	private String prenom;
	private int scorePartie;
	private GobeletBean gobelet;
	private boolean tricheur;

	public JoueurBean(String prenom) {

		this.prenom = prenom;
		gobelet = new GobeletBean();
		// } else {
		// gobelet = new GobeletBean(tricheur);
		// }

	}

	public void lancer() {

		gobelet.lancer();

	}

	public void ajouterPts() {
		scorePartie++;
	}

	public void setTricheur(boolean tricheur) {
		this.tricheur = tricheur;
		gobelet = new GobeletBean(tricheur);
	}
	// public void ajouterScoreDe() {
	// scorePartie += 1;
	// }

	// --------------------------
	// GUETTERS AND SETTERS
	// ---------------------------

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

	public GobeletBean getGobelet() {
		return gobelet;
	}

	public void setGobelet(GobeletBean gobelet) {
		this.gobelet = gobelet;
	}

	public boolean isTricheur() {
		return tricheur;
	}

}
