package pistoleros;

import armas.Arma;

public abstract class Personaje {

	protected int salud;
	private double x;
	private double y;
	private Arma arma;
	
	public Personaje(double x, double y, Arma arma) {
		super();
		this.x = x;
		this.y = y;
		setArma(arma);
	}
	
	private double distancia(Personaje p){
		return Math.sqrt(Math.pow((p.getX()-this.x),2) +Math.pow((p.getY()-this.y),2));
	}
	
	public boolean atacar(Personaje p){
		if(this.arma == null)
			throw new RuntimeException("Sin arma");
		if(salud <=0)
			throw new RuntimeException("Sin salud");
		return this.arma.disparar(p, this.distancia(p));
	}
	
	public void impacto(int dano){
		this.salud-=dano;
	}
	
	public void mover(double x, double y){
		setX(x);
		setY(y);
	}
	
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Arma getArma() {
		return arma;
	}
	
	public void recargar(){
		this.arma.recargar();
	}
	
	public void setArma(Arma arma) {
		this.arma = arma;
		this.arma.recargar();
	}
	
}
