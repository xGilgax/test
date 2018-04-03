package pack;

import java.util.Random;

public class ArrayUtils {
	public static void fillTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(100);
		}
	}

	public static void printTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	public static int getMax(int[] tab) {
		int max = tab[0];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}

		return max;
	}

	public static int getSum(int[] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}

		return sum;
	}

	public static int getMoy(int[] tab) {

		return getSum(tab) / tab.length;
	}

	public static void printSupMoy(int[] tab) {

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > getMoy(tab)) {
				System.out.print(tab[i] + " ");
			}
		}
		System.out.println();

	}

	public static int getNbMaxO2n(int[] tab) {
		int nbMax = 0;
		int max = getMax(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				nbMax++;
			}
		}

		return nbMax;
	}

	public static int getNbMaxOn(int[] tab) {
		int nbMax = 1;

		int max = tab[0];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			} else if (tab[i] == max) {
				nbMax++;
			}
		}

		return nbMax;
	}

	public static int[] fusion(int[] tab1, int[] tab2) {

		int[] fusion = new int[tab1.length + tab2.length];

		for (int i = 0; i < tab1.length; i++) {
			fusion[i] = tab1[i];

		}
		for (int i = 0; i < tab2.length; i++) {
			fusion[i + tab1.length] = tab2[i];
		}

		return fusion;
	}

	//	public static void sortTab(int[] tab) {
	//
	//		int min = tab[0];
	//		int minInd = 0;
	//		for (int j = 0; j < tab.length; j++) {
	//			for (int i = 1 + j; i < tab.length; i++) {
	//				if (tab[i] < min) {
	//					min = tab[i];
	//					minInd = i;
	//				}
	//			}
	//			tab[minInd] = tab[j];
	//			tab[j] = min;
	//		}
	//
	//	}

}
