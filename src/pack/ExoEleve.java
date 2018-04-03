package pack;

import java.util.Random;

public class ExoEleve {
	public static String getRandomName() {
		String[] name = new String[] { "Toto", "Tata", "Titi", "Bob", "Alfred" };
		return name[new Random().nextInt(name.length)];
	}

	public static void createEleve(Eleve[] tabEleve) {
		for (int i = 0; i < tabEleve.length; i++) {
			Eleve eleve = new Eleve();
			eleve.prenom = getRandomName();
			eleve.note = new Random().nextInt(20);
			tabEleve[i] = eleve;
		}
	}

	public static void printEleve(Eleve[] tabEleve) {
		for (int i = 0; i < tabEleve.length; i++) {
			System.out.println("Prenom: " + tabEleve[i].prenom + " Note: " + tabEleve[i].note);
		}
	}

	public static Eleve bestBob(Eleve[] tabEleve) {
		Eleve resultat = new Eleve();
		resultat = null;
		if (tabEleve.length == 0) {
			return resultat;
		} else {
			for (int i = 0; i < tabEleve.length; i++) {
				if (tabEleve[i] == null) {

				} else if (tabEleve[i].prenom == "Bob") {
					if (resultat == null) {
						resultat = tabEleve[i];
					} else {
						if (resultat.note < tabEleve[i].note) {
							resultat = tabEleve[i];
						}
					}

				}
			}
		}
		return resultat;
	}

}
