package pistoleros;

import armas.Arma;

public class Winchester extends Arma {
	private static final int CARGA = 2;
	private static final int DANO = 3;
	private static final double ALCANCE = 4;
	private boolean recargo = false;
	
	public Winchester() {
		this.carga = CARGA;
		this.dano = DANO;
		this.alcance = ALCANCE;		
	}
	
	public boolean disparar(Personaje atacado, double dist){
		if(this.recargo){
			this.recargo = false;
			return false;
		}
		return super.disparar(atacado, dist);
	}
	
	public void recargar(){
		this.recargo = true;
		super.recargar();
	}
}
