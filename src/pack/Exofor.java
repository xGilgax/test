package pack;

public class Exofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int testForA(String maChaine) {

		int a = 0;

		for (int i = 0; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) == 'a') {
				a += 1;
			}
		}

		return a;
	}

	public static char testForPlusGrande(String maChaine) {

		char a = 'a';

		for (int i = 0; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) > a) {
				a = maChaine.charAt(i);
			}
		}

		return a;
	}

	public static char testForPlusPetite(String maChaine) {

		char a = 'z';

		for (int i = 0; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) < a) {
				a = maChaine.charAt(i);
			}
		}

		return a;
	}

	public static int testForCombien(String maChaine) {

		char a = 'a';
		int nb = 0;

		for (int i = 0; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) > a) {
				a = maChaine.charAt(i);
			}
		}

		for (int i = 0; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) == a) {
				nb += 1;
			}
		}

		return nb;
	}

	public static String testForReverse(String maChaine) {

		String s = "";

		for (int i = 0; i < maChaine.length(); i++) {

			s = maChaine.charAt(i) + s;
		}

		return s;
	}

	public static String testForSansVoyelle(String maChaine) {

		String s = "";

		for (int i = 0; i < maChaine.length(); i++) {
			if (maChaine.charAt(i) != 'a' && maChaine.charAt(i) != 'e' && maChaine.charAt(i) != 'i' && maChaine.charAt(i) != 'o' && maChaine.charAt(i) != 'u' && maChaine.charAt(i) != 'y') {
				s = s + maChaine.charAt(i);
			}
		}

		return s;
	}

	public static boolean isTestForTri(String maChaine) {

		boolean b = true;

		for (int i = 1; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) < maChaine.charAt(i - 1)) {
				b = false;
			}
		}

		return b;
	}

	public static boolean isTestForMinuscule(String maChaine) {

		boolean b = true;

		for (int i = 0; i < maChaine.length(); i++) {

			if (maChaine.charAt(i) < 97 || maChaine.charAt(i) > 122) {
				b = false;
			}
		}

		return b;
	}

	public static String testForOrdreAlpha(String s1, String s2) {

		int plusCourt = 0;
		String resultat = "";

		if (s1.length() >= s2.length()) {
			plusCourt = s2.length();
		} else {
			plusCourt = s1.length();
		}

		for (int i = 0; i < plusCourt; i++) {

			if (s1.charAt(i) > s2.charAt(i)) {
				return resultat = s2;

			} else if (s1.charAt(i) < s2.charAt(i)) {
				return resultat = s1;

			}
		}

		if (resultat == "" && s1.length() > s2.length()) {
			return resultat = s2;
		} else if (resultat == "" && s2.length() > s1.length()) {
			return resultat = s1;
		}

		return resultat = s1;
	}

	public static char moyenne(String maChaine) {
		return (char) (somme(maChaine) / maChaine.length());
	}

	public static int somme(String maChaine) {
		int resultat = 0;
		for (int i = 0; i < maChaine.length(); i++) {
			char c = maChaine.charAt(i);
			// Action
			resultat += c;
		}

		return resultat;
	}

}
