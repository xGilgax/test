package pack;

import java.util.Random;

public class ExoMaison {
	public static void printMaison(Maison maison) {
		System.out.println("La largeur de la maison est: " + maison.largeur + "  La longueur de la maison est: " + maison.longueur);
	}

	public static void doubleMaison(Maison maison) {
		maison.largeur *= 2;
		maison.longueur *= 2;
	}

	public static Maison bigMaison(Maison m1, Maison m2) {
		if (m1 == null && m2 == null) {
			return null;
		} else if (m1 == null) {
			return m2;
		} else if (m2 == null) {
			return m1;
		} else if (m1.largeur * m1.longueur > m2.largeur * m2.longueur) {
			return m1;
		} else if (m1.largeur * m1.longueur < m2.largeur * m2.longueur) {
			return m2;
		}

		return null;
	}

	public static void createMaison(Maison[] tab) {
		for (int i = 0; i < tab.length; i++) {
			Maison maison = new Maison();
			maison.largeur = new Random().nextInt(50);
			maison.longueur = new Random().nextInt(50);
			tab[i] = maison;
		}
	}

	//	public static void printMaison(Maison[] tab) {
	//		for (int i = 0; i < tab.length; i++) {
	//			System.out.println("La maison" + tab[i] + "a des dimensions de" + tab[i].largeur + "*" + tab[i].longueur);
	//		}
	//	}

	public static void printMaisons(Maison[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + ":" + tab[i].largeur + "x" + tab[i].longueur);
		}

	}

	/** Retourne la maison la plus grande (Longueur * largeur) */
	//    public static Maison bigMaison(Maison[] tab) {
	//        if (tab == null) {
	//            return null;
	//        }
	//        Maison maisonMax = null;
	//        for (int i = 0; i < tab.length; i++) {
	//            if (maisonMax == null) {
	//                maisonMax = tab[i];
	//            }
	//            // Action
	//            else if (tab[i].largeur * tab[i].longueur > maisonMax.largeur * maisonMax.longueur) {
	//                maisonMax = tab[i];
	//            }
	//        }
	//        return maisonMax;
	//    }

}
