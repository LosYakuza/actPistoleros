package pistoleros;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import armas.Colt;
import armas.Derringer;
import armas.Renegado;

public class Prueba {

	@Test
	public void testGeneral() {
		Personaje p;
		Personaje p2;
		p = new Sheriff(1, 1, new Colt());
		p2 = new Renegado(1, 1, new Colt());
		
		p.atacar(p2);
		Assert.assertEquals(7, p2.getSalud());
		
		Personaje p3 = new Alguacil(10, 10, new Colt());
		Assert.assertEquals(false, p.atacar(p3)); //false por alcance
		
		Personaje p4 = new Alguacil(1, 1, new Colt());
		p.atacar(p4);
		p.atacar(p3);
		p.atacar(p4);
		p.atacar(p2);
		
		Assert.assertEquals(false, p.atacar(p)); //se quedo sin balas y no recargo
		
		p.recargar();
		Assert.assertEquals(true, p.atacar(p2)); //recargó y pudo disparar
	}
	
	@Test
	public void testDerringer() {
		Personaje p = new Alguacil(1, 1, new Derringer());
		Personaje p2 = new Renegado(1, 3, new Colt());
		
		for (int i = 0; i < 3; i++) {
			p.atacar(p2);
			p.atacar(p2);
			p.recargar();
		}
		
		p.atacar(p2);
		Assert.assertEquals(true, p.atacar(p2));
		p.recargar();
		
		Assert.assertEquals(false, p.atacar(p2)); 
	}
	
	@Test
	public void testWinchester() {
		Personaje p = new Sheriff(1, 1, new Winchester());
		Personaje p2 = new Sheriff(1, 4, new Winchester());
		
		p.atacar(p2);
		p.recargar();
		
		Assert.assertEquals(false, p.atacar(p2));
		Assert.assertEquals(true, p.atacar(p2));
	}

}
