package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean enPreciosCuidado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public boolean esPrecioCuidado() {
		return enPreciosCuidado;
	}



	public void setEsPrecioCuidado(boolean enPreciosCuidado) {
		this.enPreciosCuidado = enPreciosCuidado;
	}



	


	public Producto(String nombre, double d, boolean dentroDelPrograma) {
		this.setNombre(nombre);
		this.setPrecio(d);
		this.setEsPrecioCuidado(dentroDelPrograma);
	}


	
	public Producto(String nom, double d) {
		this.setNombre(nom);
		this.setPrecio(d);
	}

	public void aumentarPrecio(double d) {
		precio= precio + d;
		
	}

}
