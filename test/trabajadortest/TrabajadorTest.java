package trabajadortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.HorasExtras;
import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.Trabajador;

class TrabajadorTest {
	private Trabajador pepe;
	private Ingreso horasTrabajadas;
	private Ingreso antiguedad;
	private Ingreso horasExtras;
	
	@BeforeEach
	public void setUp() {
		horasExtras= new HorasExtras("Abril", "Horas Extras", 256f);
		antiguedad= new Ingreso("Abri", "Antiguedad",100f);
		horasTrabajadas= new Ingreso("Abri", "Horas Trabajadas", 22000f);
		pepe= new Trabajador();
		pepe.addIngreso(horasExtras);
		pepe.addIngreso(antiguedad);
		pepe.addIngreso(horasTrabajadas);
	}
	
	@Test
	void totalPercibidotest() {
		assertEquals(22356,pepe.getTotalPercibido());
	}
	@Test
	void totalMontoImponibletest() {
		assertEquals(22100,pepe.getMontoImponible());
	}
	@Test
	void totalImpuestoAPagartest() {
		assertEquals(442f,pepe.getImpuestoAPagar());
	}


}
