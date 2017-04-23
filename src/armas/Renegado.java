package armas;

import pistoleros.Personaje;

public class Renegado extends Personaje {
	private static final int SALUD = 9;
	public Renegado(double x, double y, Arma arma) {
		super(x, y, arma);
		this.salud = SALUD;
	}
}