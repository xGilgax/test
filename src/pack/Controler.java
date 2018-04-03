package pack;

public class Controler {
	static void lancer() {
		PartieBean p = new PartieBean("Bob", "Toto");
		System.out.print("Tour ");
		System.out.print(p.getJ1().getPrenom() + " ");
		System.out.println(p.getJ2().getPrenom());
		for (int i = 0; i < PartieBean.NB_TOUR; i++) {
			p.ajouterTour();
			System.out.print(p.getTourEnCours() + " ");
			p.setJoueurActif(p.getJ1());

			p.getJ1().lancer();
			System.out.print(p.getJ1().getGobelet().getScoreDe() + " ");
			if (p.getJ1().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
				p.getJ1().ajouterPts();
			}
			p.setJoueurActif(p.getJ2());
			p.getJ2().lancer();
			System.out.println(p.getJ2().getGobelet().getScoreDe());

			if (p.getJ2().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
				p.getJ2().ajouterPts();
				;
			}
		}

		System.out.println("Score de " + p.getJ1().getPrenom() + " est: " + p.getJ1().getScorePartie());
		System.out.println("Score de " + p.getJ2().getPrenom() + " est: " + p.getJ2().getScorePartie());
		System.out.println();

		if (p.getJ1().getScorePartie() < p.getJ2().getScorePartie()) {
			System.out.println(p.getJ2().getPrenom() + "  GAGNE!!! " + p.getJ2().getScorePartie() + " à " + p.getJ1().getScorePartie());
		} else if (p.getJ1().getScorePartie() == p.getJ2().getScorePartie()) {
			System.out.println("MATCH NUL!!!" + p.getJ1().getScorePartie() + "à" + p.getJ2().getScorePartie());
		} else if (p.getJ1().getScorePartie() > p.getJ2().getScorePartie()) {
			System.out.println(p.getJ1().getPrenom() + "  GAGNE!!! " + p.getJ1().getScorePartie() + " à " + p.getJ2().getScorePartie());
		}

		System.out.println("Nombre de tours joues:  " + p.getTourEnCours());

	}
}
