package ar.edu.unq.po2.tp5;

public class Producto {
  private String nombre;
  private int stockDisponible;
  private double precio;
  
  public void registrar() {
	stockDisponible--;
	
  }

  
  public Producto(String nombre, int stockDisponible, double precio) {
	super();
	this.nombre = nombre;
	this.stockDisponible = stockDisponible;
	this.precio = precio;
  }


public String getNombre() {	
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  public int getStockDisponible() {
	return stockDisponible;
  }

  public void setStockDisponible(int stockDisponible) {
	this.stockDisponible = stockDisponible;
  }

  public double getPrecio() {
	return precio;
  }

  public void setPrecio(double precio) {
	this.precio = precio;
  }


  
  
  
}

