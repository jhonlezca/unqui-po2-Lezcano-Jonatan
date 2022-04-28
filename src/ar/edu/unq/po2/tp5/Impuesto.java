package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura implements  Item {
  private double tasaDelServicio;
  
  	public Impuesto(double tasa){
  		this.tasaDelServicio= tasa;
  	}
	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return tasaDelServicio;
	}
	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return this.montoAPagar();
	}
	@Override
	public void registrate() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
