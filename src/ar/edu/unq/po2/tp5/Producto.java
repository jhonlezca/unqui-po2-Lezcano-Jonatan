package ar.edu.unq.po2.tp5;

public class Producto implements Item  {
  private String nombre;
  private int stockDisponible;
  private double precio;
  private boolean empresaCooperativa=false;
  
 

  @Override
  public double getValor() {
	// TODO Auto-generated method stub
	return this.getPrecio();
  }


  @Override
  	public void registrate() {
	
	stockDisponible--;
  }

  
  public Producto(String nombre, int stockDisponible, double precio, boolean b) {
	super();
	this.nombre = nombre;
	this.stockDisponible = stockDisponible;
	this.precio = precio;
	this.empresaCooperativa= b;
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
	  if(this.empresaCooperativa== true) this.precio=precio*0.9;
	return precio;
  }

  public void setPrecio(double precio) {
	this.precio = precio;
  }





  
  
  
}

