package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productosDistribuidos= new ArrayList<Producto>();
	
	public Supermercado(String newNombre, String newDir) {
		this.setNombre(newNombre);
		this.setDireccion(newDir);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		int cantidadProducto= 0;
		for (Producto producto : productosDistribuidos) {
			cantidadProducto++;
		}
		return cantidadProducto;
	}

	public void agregarProducto(Producto productoNuevo) {
		productosDistribuidos.add(productoNuevo);
	}

	public Double getPrecioTotal() {
		double precioTotal= 0;
		for (Producto producto : productosDistribuidos) {
			precioTotal= precioTotal+producto.getPrecio();
		}
		return precioTotal;
	}

	
	
	

}
