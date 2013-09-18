package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testConversor {

	Conversor C1 = new Conversor();
	
	@Test
	public void testCelsiusParaFahrenheit() {
		assertEquals(32, C1.celsiusParaFahrenheit(0));
		assertEquals(104, C1.celsiusParaFahrenheit());
	}
	

}
