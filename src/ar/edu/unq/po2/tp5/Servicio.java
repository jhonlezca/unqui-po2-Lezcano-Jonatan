package ar.edu.unq.po2.tp5;

public class Servicio extends Factura implements Item{
  private double costoUnitario;
  private int unidadesConsumidas;
  
  	public Servicio(double costo, int unidades) {
  		this.costoUnitario= costo;
  		this.unidadesConsumidas= unidades;
  	}
	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return costoUnitario * unidadesConsumidas;
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
