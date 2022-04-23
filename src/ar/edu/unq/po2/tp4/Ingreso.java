package ar.edu.unq.po2.tp4;

public class Ingreso {
  private String mesPercibido;
  private String concepto;
  private float montopercibido ; 
  private float impuestoImponible ;

 
  
 

public Ingreso(String mes, String concepto2, float monto) {
	  this.setMesPercibido(mes);
	  this.setConcepto(concepto2);
	  this.setMontopercibido(monto);
	  this.setImpuestoImponible(monto);
		
}



public void setMesPercibido(String mesPercibido) {
	this.mesPercibido = mesPercibido;

  }
  

  public void setConcepto(String concepto) {
	this.concepto = concepto;

  }

  public void setMontopercibido(float montopercibido) {
	this.montopercibido = montopercibido;

  }

  public float getMontoPercibido() {
	  return montopercibido;
  }
  public float getImpuestoImponible() {
	return impuestoImponible;

  }

  public void setImpuestoImponible(float impuestoImponible) {
	this.impuestoImponible = impuestoImponible;

  } 
  
  
}
