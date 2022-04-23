package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Counter {
  private List<Integer> listNumber= new ArrayList<Integer>();
  
  public boolean isEven(int num) {
	  return num % 2 == 0;
  }
  
  // Contador de pares
  public int counterEvenNumber() {
	  int cantEvenNumber = 0;
	  for (Integer number : listNumber) {
		if(this.isEven(number)) cantEvenNumber++;
	}
	  return cantEvenNumber;
  }
  // Contador de impares

  public int counterOddNumber() {
	  int cantOddNumber = 0;
	  for (Integer number : listNumber) {
		if(! this.isEven(number)) cantOddNumber++;
	}
	  return cantOddNumber;
  }
  // Contador de multiplos de un numero
  
  public int counterMultiple(int n) {
	int cantmultiple = 0;
	 for (Integer number : listNumber) {
		if(this.isMultiple(number, n)) cantmultiple++;
	}
	
	return cantmultiple;
  }
  
  // Funcion desarmador de numero
  
  // Funcion Multiplos
  public int highestMultipleBetween(int a, int b) {
	  int highestMultiple = -1;
	  for (int i = 0; i < 1001; i++) {
		  if(this.isMultiple( i,a) && this.isMultiple(i,b)) highestMultiple= i;
	}
	  return highestMultiple;
  }
  
  private boolean isMultiple(int i, int n) {
	// TODO Auto-generated method stub
	return i%n == 0;
  }

  public void addNumber(int i) {
	listNumber.add(i);
	
  }
  
  
}
