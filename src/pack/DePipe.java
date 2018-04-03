package pack;

public class DePipe extends DeBean {
	@Override
	public void lancer() {
		// int i = RANDOM.nextBoolean();
		int i = 1;
		if (i == 1) {
			valeur = 6;
		} else {
			super.lancer();
		}
	}

	// @Override
	// public void lancer() {
	// if (RANDOM.nextBoolean()) {
	// super.lancer();
	// } else {
	// value = 6;
	// }
	//
	// }
	//
	// }

}
