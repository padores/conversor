package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testConversor {

	Conversor C1 = new Conversor();
	
	@Test
	public void testCelsiusParaFahrenheit() {
		assertEquals(32, C1.celsiusParaFahrenheit(0));
		assertEquals(104, C1.celsiusParaFahrenheit());
		assertEquals(32.0, C1.celsiusParaFahrenheit(0.0), 0.1);
	}
	
	@Test
	public void testFahrenheitParaCelsius(){
		assertEquals(-17, C1.fahrenheitParaCelsius(0));
		assertEquals(-17.7, C1.fahrenheitParaCelsius(0.0), 0.1);
	}
	
	@Test
	public void testKelvinParaCelsius(){
		assertEquals(0,C1.kelvinParaCelsius(273));
		assertEquals(0.0,C1.kelvinParaCelsius(273.0), 0.0);
	}
	
	@Test
	public void testCelsiusParaKelvin(){
		assertEquals(273,C1.celsiusParaKelvin(0));
		assertEquals(273.0,C1.celsiusParaKelvin(0.0),0.0);
	}
	
	@Test
	public void testFahrenheitParaKelvin(){
		assertEquals(272,C1.fahrenheitParaKelvin(30));
		assertEquals(271.8,C1.fahrenheitParaKelvin(30.0),0.1);
	}
	
	@Test
	public void testKelvinParaFahrenheit(){
		assertEquals(-459,C1.kelvinParaFahrenheit(0));
		assertEquals(-459.0,C1.kelvinParaFahrenheit(0), 0.1);
	}

}
