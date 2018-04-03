package pack;

import java.util.Random;

public class De {
	private int value;
	private int demin;
	private int demax;

	public De(int value) {
		super();
		this.value = value;
	}

	public De() {
		this(1);
	}

	public De(int demin, int demax) {
		this.demin = demin;
		this.demax = demax;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;

	}

	//	public void lancer() {
	//		value = (new Random().nextInt(6) + 1);
	//	}

	public void lancer() {
		value = (new Random().nextInt((demax - demin) + 1) + demin);
	}
}
