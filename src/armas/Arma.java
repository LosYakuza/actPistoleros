package armas;

import pistoleros.Personaje;

public abstract class Arma {
	private int balas;
	protected int carga;
	protected int dano;
	protected double alcance;
	
	public boolean disparar(Personaje atacado, double dist){
		if(balas == 0)
			return false;
		balas--;
		if(alcance<dist)
			return false;
		
		atacado.impacto(this.dano);
		return true;
	}
	
	public void recargar(){
		this.balas = this.carga;
	}
	
	
}
