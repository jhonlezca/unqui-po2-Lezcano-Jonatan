package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

import java.math.MathContext;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad azucar;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,9);
		azucar = new ProductoPrimeraNecesidad("Azucar", 70d,true,11);
		arroz= new ProductoPrimeraNecesidad("Arroz", 3d,true,8);
	}
	
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
		assertEquals(new Double(77), azucar.getPrecio());
		assertEquals(new Double(2.4), arroz.getPrecio());
	}
	
}
