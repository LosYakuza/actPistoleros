package pistoleros;

import armas.Arma;

public class Alguacil extends Personaje {
	private static final int SALUD = 6;
	public Alguacil(double x, double y, Arma arma) {
		super(x, y, arma);
		this.salud = SALUD;
	}
}