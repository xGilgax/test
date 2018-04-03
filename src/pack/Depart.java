package pack;

public class Depart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");
		double resultat = Exo.photocopie(10);
		System.out.println("resultat =" + resultat);
		Exo.exo1();
		Exo.exo2(9);
		Exo.exo2(-5);
		Exo.sub(5, 7);
		Exo.sub(7, 5);
		int resulta = Exo.multiplyAndAdd(1, 2, 3);
		System.out.println("Resultat = " + resulta);
		int a = -20, b = -12, c = 64;
		Exo.max(a, b, c);
		Exo.mult47();
		Exo.plusPetit();
		String t = "aggaavvdderyuaoshqoazzzzzzzzzzz";
		String s = "ajcdefksw";
		String u = "ajcdefkswgfqsdgsdfg";

		int aAscii = 'E';
		System.out.println("Il y a : " + Exofor.testForA(s) + " a");
		System.out.println("La lettre la plus grande est : " + Exofor.testForPlusGrande(s));
		System.out.println("La lettre la plus petite est : " + Exofor.testForPlusPetite(s));
		System.out.println("La lettre la plus grande apparait : " + Exofor.testForCombien(s) + " fois");
		System.out.println("Reverse : " + Exofor.testForReverse(s));
		System.out.println("a ascii : " + aAscii);
		System.out.println("Sans voyelles : " + Exofor.testForSansVoyelle(s));
		System.out.println("Trie? : " + Exofor.isTestForTri(s));
		System.out.println("Minuscules? : " + Exofor.isTestForMinuscule(s));
		System.out.println("Ordre alpha : " + Exofor.testForOrdreAlpha(s, t));
		System.out.println("Somme : " + Exofor.somme(s));
		int tab[] = new int[10];
		int tab1[] = new int[] { 0, 1, 6, 4, 15, 8, 3, 10, 15 };
		ArrayUtils.fillTab(tab);
		System.out.println("tab");
		ArrayUtils.printTab(tab);
		System.out.println("tab1");
		ArrayUtils.printTab(tab1);
		System.out.println("Le maximum du tableau est : " + ArrayUtils.getMax(tab));
		System.out.println("La somme des nombres du tableau est : " + ArrayUtils.getSum(tab));
		System.out.println("La moyenne des nombres du tableau est : " + ArrayUtils.getMoy(tab));
		ArrayUtils.printSupMoy(tab);
		System.out.println("Le nombre de fois que le max du tableau apparait est : " + ArrayUtils.getNbMaxO2n(tab));
		System.out.println("Le nombre de fois que le max du tableau apparait est : " + ArrayUtils.getNbMaxOn(tab));
		System.out.println("Fusion: ");
		ArrayUtils.printTab(ArrayUtils.fusion(tab, tab1));
		System.out.println("Trie: ");
		// ArrayUtils.sortTab(tab);
		ArrayUtils.printTab(tab);

		Maison maison1 = new Maison();
		maison1.largeur = 3;
		maison1.longueur = 5;

		Maison maison2 = new Maison();
		maison2.largeur = 8;
		maison2.longueur = 10;
		ExoMaison.printMaison(maison1);
		ExoMaison.printMaison(maison2);

		ExoMaison.doubleMaison(maison1);
		System.out.println("La taille de la maison doublee est : ");
		ExoMaison.printMaison(maison1);
		System.out.println("La maison la plus grande est: " + ExoMaison.bigMaison(maison1, maison2));

		Maison[] tabMaison = new Maison[5];
		ExoMaison.createMaison(tabMaison);
		ExoMaison.printMaisons(tabMaison);
		Eleve[] tabEleve = new Eleve[5];
		ExoEleve.createEleve(tabEleve);
		ExoEleve.printEleve(tabEleve);
		//Eleve bestBob = new Eleve();
		//bestBob = ExoEleve.bestBob(tabEleve);
		//System.out.println("Prenom de Bob: " + bestBob.prenom + "  Note de Bob: " + bestBob.note);
		DeBean de = new DeBean();
		//De de1 = new De(2, 12);
		//		System.out.println("Vous avez lance un: " + de.getValue());
		//		de.lancer();
		//		System.out.println("Vous avez lance un: " + de.getValue());
		//		System.out.println("Vous avez lance un: " + de1.getValue());
		//		de1.lancer();
		//		System.out.println("Vous avez lance un: " + de1.getValue());

		//		de.lancer();
		//		System.out.println("Vous avez lance un: " + de.getValeur());
		//		GobeletBean gobelet = new GobeletBean();
		//		gobelet.lancer();
		//		System.out.println("Le score du lancer de de est : " + gobelet.getScoreDe());

		//		JoueurBean joueur = new JoueurBean("Bob");
		//		joueur.lancer();
		//		System.out.println(
		//				"Le prenom du joueur est : " + joueur.getPrenom() + "  Le score du lancer de de est : " + joueur.gobelet.getScoreDe() + "  Le score du joueur est : " + joueur.getScorePartie());
		System.out.println();
		System.out.println();
		System.out.println();
		Controler.lancer();

	}

}
