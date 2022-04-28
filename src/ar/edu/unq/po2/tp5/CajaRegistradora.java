package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.Producto;

public class CajaRegistradora {
  private double totalAPagar;
  private List<Item> Items= new ArrayList<Item>();	
  

  	public void registrarItem(Item item) {
  		
  		totalAPagar+=item.getValor();
  		item.registrate();
  	}
  	public void registrarItemns(){
  		for (Item item : Items) {
			this.registrarItem(item);;
		}
  	}
  	
	public void listarItems(Item i) {
		Items.add(i);
	}

	public double getTotalAPagar() {
	
	return totalAPagar;
	}

	


}
