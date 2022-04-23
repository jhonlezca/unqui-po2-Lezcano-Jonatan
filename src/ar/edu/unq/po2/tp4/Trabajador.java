package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
  
	private float impuestoAPagar;

	
	private List<Ingreso> ingresos= new ArrayList<Ingreso>();
	
	public float getImpuestoAPagar() {
		impuestoAPagar= this.getMontoImponible()*0.02f;
		return impuestoAPagar;
	}

	public float getTotalPercibido() {
		float totalPercibido = 0f;
		for (Ingreso ingreso : ingresos) {
			totalPercibido+= ingreso.getMontoPercibido(); 
		}
		
		return totalPercibido;
	}

	public float getMontoImponible() {
		
		float MontoImponible = 0;
		for (Ingreso ingreso : ingresos) {
			MontoImponible+= ingreso.getImpuestoImponible(); 
		}
		return MontoImponible;
	}

	public void addIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
  
  
  
}
