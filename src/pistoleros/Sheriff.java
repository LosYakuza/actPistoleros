package pistoleros;

import armas.Arma;

public class Sheriff extends Personaje {
	private static final int SALUD = 10;
	public Sheriff(double x, double y, Arma arma) {
		super(x, y, arma);
		this.salud = SALUD;
	}
}
