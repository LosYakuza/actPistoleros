package armas;

import pistoleros.Personaje;

public class Derringer extends Arma {
	private static final int CARGA = 2;
	private static final int DANO = 1;
	private static final double ALCANCE = 1.5;
	private int maxTiros = 8;
	
	public Derringer() {
		this.carga = CARGA;
		this.dano = DANO;
		this.alcance = ALCANCE;		
	}
	
	public boolean disparar(Personaje atacado, double dist){
		if(maxTiros == 0 )
			return false;
		maxTiros--;
		return super.disparar(atacado, dist);
	}
}
