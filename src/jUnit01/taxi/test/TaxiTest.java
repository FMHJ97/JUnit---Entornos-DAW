package jUnit01.taxi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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
		double objetivo = 19;
		assertEquals(objetivo, resultado, 0.1);
	}

}
