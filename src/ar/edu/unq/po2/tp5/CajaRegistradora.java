package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.Producto;

public class CajaRegistradora {
  private double totalAPagar;
  private List<Producto> productos= new ArrayList<Producto>();	
	
  	public void registrarProducto(Producto prod) {
		totalAPagar+=prod.getPrecio();
		prod.registrar();
		this.listarProductos(prod);
	}

	private void listarProductos(Producto prod) {
		this.productos.add(prod);
	}

	public double getTotalAPagar() {
	
	return totalAPagar;
	}

}
