package pack;

public class Exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static double photocopie(int nbPhoto) {
		if (nbPhoto <= 10) {
			return nbPhoto * 0.1;
		} else if (nbPhoto <= 30) {
			return 1 + (nbPhoto - 10) * 0.09;
		} else {
			return 2.8 + (nbPhoto - 30) * 0.08;
		}
	}

	//		static void exo1() {
	//			int i = 7, j = 3;
	//			System.out.println("Division entiere: " + i + "/" + j + "=" + i / j + "\n" + "\n" + "Reste: " + i + "%" + j + "=" + i % j + "\n");
	//			double k = j;
	//			System.out.println("Division classique: " + i + "/" + k + "=" + i / k + "\n" + "\n" + "La somme des trois est: " + (i / j + i % j + i / k));
	//		}

	static void exo1() {
		int i = 7;
		int j = 3;
		int divEntiere = i / j;
		int reste = i % j;
		double divClassique = i / (double) j;
		double somme = divClassique + divEntiere + +reste;

		System.out.println("La division entière : " + divEntiere);
		System.out.println("La reste : " + reste);
		System.out.println("La division classique : " + divClassique);
		System.out.println("La somme des 3 : " + somme);

		System.out.println("La somme : " + i + j);
		// attention a la concatenation pour forcer le calcul " (i+j) " parentheses

	}

	static void exo2(int a) {
		System.out.println("Exo2" + "\n" + "\n" + a + "+" + 5 + "=" + (a + 5) + "\n");
	}

	static void sub(int a, int b) {
		System.out.println("sub" + "\n" + "\n" + a + "-" + b + "=" + (a - b) + "\n");
	}

	//	static void multiplyAndAdd(int a, int b, int c) {
	//		System.out.println("multiplyAndAdd" + "\n" + "\n" + "(" + b + "+" + c + ")" + "*" + a + "=" + (b + c) * a + "\n");
	//	}
	static int multiplyAndAdd(int a, int b, int c) {
		return (b + c) * a;
	}

	static int max(int a, int b, int c) {
		int d, e;

		if (a >= b) {
			d = a;
		} else {
			d = b;
		}

		if (d >= c) {
			e = d;
		} else {
			e = c;
		}
		System.out.println("Le max entre " + a + "," + b + "," + c + " est " + e);
		return e;
	}

	//	correction
	//	static int max(int a, int b, int c) {
	//        if (a >= b && a >= c) {
	//            return a;
	//        } else if (b >= a && b >= c) {
	//            return b;
	//        } else {
	//            return c;
	//        }
	//    }

	public static void mult47() {
		for (int i = 1; i <= 10000; i++) {

			if (i % 47 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void plusPetit() {
		int i = 0;
		while (!(i % 7 == 0 && i % 11 == 0 && i % 5 == 0 && ((2 * i - 1) % 36 == 1))) {
			i++;
		}
		System.out.println("le premier nombre qui verifie les conditions est: " + i);
	}
}
