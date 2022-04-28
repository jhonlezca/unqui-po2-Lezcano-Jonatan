package cajaRegistradora;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.Servicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp5.CajaRegistradora;
import ar.edu.unq.po2.tp5.Factura;
import ar.edu.unq.po2.tp5.Impuesto;
import ar.edu.unq.po2.tp5.Item;

class CajaRegistradoraTest {

	private CajaRegistradora caja1;
	private Item arroz;
	private Item vino;
	private Item fideo;
	private Item harina;
	private Item edeSur;
	private Item aysa;
	private Item flete;
	private Item acarreo;
	/**
	 * se crea una nueva caja registradora 
	 * 
	 * 
	 */
	@BeforeEach
	public void setUp() {
		caja1= new CajaRegistradora();
		arroz=new Producto("Arroz", 10, 8d, false);
		vino=new Producto("Vino", 8, 9d,false);
		harina=new Producto("Harina", 10, 10d, true);
		fideo=new Producto("Fideo", 8, 15d,true);
		edeSur= new Impuesto(3000);
		aysa= new Impuesto(1500);
		flete= new Servicio(300,2);
		acarreo= new Servicio(1500, 1);
		
		caja1.listarItems(arroz);
		caja1.listarItems(vino);
		caja1.listarItems(harina);
		caja1.listarItems(fideo);
		caja1.listarItems(edeSur);
		caja1.listarItems(aysa);
		caja1.listarItems(flete);
		caja1.listarItems(acarreo);
		caja1.registrarItemns();
		
	}
	
	@Test
	void cajaRegistraProductostest() {
		assertEquals(6639.5d,caja1.getTotalAPagar());
	}

}
