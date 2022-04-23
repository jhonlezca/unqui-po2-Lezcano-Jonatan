package ar.edu.unq.po2.tp4;

import java.text.DecimalFormat;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuentoDeProducto;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean dentroDelPrograma, int descuento) {
		super(nombre, precio, dentroDelPrograma) ;
		this.descuentoDeProducto= descuento;
	}
	public double aplicaDescuento() {
		return descuentoDeProducto/10;
	}

	

	public double getPrecio() {

			double precioFinal= super.getPrecio()*this.aplicaDescuento() ; 
			precioFinal=Math.round(precioFinal*100)/100d;
		return precioFinal ;
	}

	

	
	

}
