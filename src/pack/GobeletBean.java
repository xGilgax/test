package pack;

public class GobeletBean {
	private DeBean d1, d2;
	private boolean truque;
	// DeBean d1 = new DeBean();
	// DeBean d2 = new DeBean();

	public GobeletBean() {

		this(false);

	}

	public GobeletBean(boolean truque) {
		if (truque) {
			d1 = new DePipe();
			d2 = new DePipe();
		} else {
			d1 = new DeBean();
			d2 = new DeBean();
		}

	}

	public void lancer() {
		d1.lancer();
		d2.lancer();
	}

	public int getScoreDe() {
		int scoreDe = d1.getValeur() + d2.getValeur();
		return scoreDe;
	}

	// --------------------------
	// GUETTERS AND SETTERS
	// ---------------------------

	public DeBean getD1() {
		return d1;
	}

	public void setD1(DeBean d1) {
		this.d1 = d1;
	}

	public DeBean getD2() {
		return d2;
	}

	public void setD2(DeBean d2) {
		this.d2 = d2;
	}

	public boolean isTruque() {
		return truque;
	}

	public void setTruque(boolean truque) {
		this.truque = truque;
	}

}
