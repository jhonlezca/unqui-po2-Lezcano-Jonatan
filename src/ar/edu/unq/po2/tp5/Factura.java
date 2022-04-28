package ar.edu.unq.po2.tp5;

public abstract class Factura implements Agencia {

	public abstract double montoAPagar();
	

	public double getValor() {
		// TODO Auto-generated method stub
		return this.montoAPagar();
	}


	public void registrate() {
		this.registrarPago(this);
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}

	

}
