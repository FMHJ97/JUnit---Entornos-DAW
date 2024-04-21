package jUnit01.taxi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jUnit01.taxi.app.CalcularPago;

class TaxiTest {

	@Test
	void test1() {
		double resultado = CalcularPago.calcularPago(0.5);
		double objetivo = 20;
		assertEquals(objetivo, resultado);
	}
	
	@Test
	void test2() {
		double resultado = CalcularPago.calcularPago(29.99999999999);
		double objetivo = 20;
		assertEquals(objetivo, resultado, 0.1);
	}
	
	@Test
	void test3() {
		Assertions.assertTrue(
				CalcularPago.calcularPago(30) == 20);
	}
	
	@Test
	void test4() {
		assertFalse(CalcularPago.calcularPago(30.1) == 20);
	}
	
	@Test
	void test5() {
		assertNotEquals(CalcularPago.calcularPago(100),
				CalcularPago.calcularPago(100.1));
	}

}
