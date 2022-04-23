package ar.edu.unq.po2.tp4;

public class HorasExtras extends Ingreso {
	private float horasExtras;
	
	public HorasExtras(String mes, String concepto, float monto) {
		super(mes, concepto, monto);
		// TODO Auto-generated constructor stub
		super.setImpuestoImponible(0); 
	}

	public float getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(float horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public float getImpuestoImponible() {
		return 0.0f;
		
	}

}
