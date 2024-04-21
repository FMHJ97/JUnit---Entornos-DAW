package jUnit01.temperatura.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jUnit01.temperatura.app.Temperatura;

class TemperaturaTest {

	@Test
	void test1() {
		assertEquals(Temperatura.sportByTempt(5),
				Temperatura.sportByTempt(4));
	}
	
	@Test
	void test2() {
		assertNotEquals(Temperatura.sportByTempt(5),
				Temperatura.sportByTempt(5.001));
	}
	
	@Test
	void test3() {
		assertTrue(Temperatura.sportByTempt(30).equals("Tenis"));
	}
	
	@Test
	void test4() {
		assertFalse(Temperatura.sportByTempt(22.01).equals("Natación"));
	}
	
	@Test
	void test5() {
		assertEquals(Temperatura.sportByTempt(-5),
				Temperatura.sportByTempt(5));
	}

}
