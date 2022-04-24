package cajaRegistradora;
import ar.edu.unq.po2.tp5.Producto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp5.CajaRegistradora;

class CajaRegistradoraTest {

	private CajaRegistradora caja1;
	private Producto arroz;
	private Producto vino;
	 
	/**
	 * se crea una nueva caja registradora 
	 * 
	 * 
	 */
	@BeforeEach
	public void setUp() {
		caja1= new CajaRegistradora();
		arroz=new Producto("Arroz", 10, 8d);
		vino=new Producto("Vino", 8, 9d);
		caja1.registrarProducto(arroz);
		caja1.registrarProducto(vino);
	}
	
	@Test
	void cajaRegistraProductostest() {
		assertEquals(17d,caja1.getTotalAPagar());
	}

}
