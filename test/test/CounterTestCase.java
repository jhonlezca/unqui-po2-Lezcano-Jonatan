/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
	Counter counter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*
	*/
		
	@BeforeEach
	public void setUp(){
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	@Test

	public void testCounterPair() {
		assertEquals(counter.counterEvenNumber(), 1);
		
	}
	@Test
	public void testCounterOdd() {
		assertEquals(counter.counterOddNumber(), 9);
		
	}
	@Test
	public void testCounterMultiple() {
		assertEquals(counter.counterMultiple(2), 1);
	}
	@Test 
	public void testhighestMultipleBetween() {
		assertEquals(counter.highestMultipleBetween(3,9),999);
	}
	
}
