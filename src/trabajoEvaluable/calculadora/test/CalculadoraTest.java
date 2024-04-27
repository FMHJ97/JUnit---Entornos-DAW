/**
 * 
 */
package trabajoEvaluable.calculadora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import trabajoEvaluable.calculadora.app.Calculadora;

/**
 * Clase que comprueba el funcionamiento de cada uno de los métodos 
 * de la Clase Calculadora.java a través de JUnit5.
 */
class CalculadoraTest {

	/**
	 * Prueba el método factorial de la clase Calculadora, 
	 * donde se espera que el factorial de 0 sea 1.
	 * @see Calculadora#factorial(int)
	 */
	@Test
	void testFactorial01() {
		assertEquals(1, Calculadora.factorial(0));
	}
	
	/**
	 * Prueba el método factorial de la clase Calculadora 
	 * para verificar si el factorial de 0 es igual al factorial de 1.
	 * @see Calculadora#factorial(int)
	 */
	@Test
	void testFactorial02() {
		assertTrue(Calculadora.factorial(0) 
				== Calculadora.factorial(1),
				"El factorial de 0 debe ser igual al factorial de 1.");
	}
	
	/**
	 * Prueba el método factorial de la clase Calculadora, 
	 * donde se espera que el factorial de 5 sea 120.
	 * @see Calculadora#factorial(int)
	 */
	@Test
	void testFactorial03() {
		assertEquals(120, Calculadora.factorial(5));
	}
	
	/**
	 * Prueba el método esCapicua de la clase Calculadora 
	 * para verificar si el número 10101 es capicúa.
	 * @see Calculadora#esCapicua(int)
	 */
	@Test
	void testCapicua01() {
		assertTrue(Calculadora.esCapicua(10101),
				"El número 10101 debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esCapicua de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número 15243451.
	 * @see Calculadora#esCapicua(int)
	 */
	@Test
	void testCapicua02() {
		assertFalse(Calculadora.esCapicua(15243451),
				"El número 15243451 NO debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esCapicua de la clase Calculadora. 
	 * Se verifica que el método devuelve true para el número 0.
	 * @see Calculadora#esCapicua(int)
	 */
	@Test
	void testCapicua03() {
		assertTrue(Calculadora.esCapicua(0),
				"El número 0 debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esCapicua de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número -555 
	 * debido a que los números negativos no se consideran capicúas 
	 * en nuestro método.
	 * @see Calculadora#esCapicua(int)
	 */
	@Test
	void testCapicua04() {
		assertFalse(Calculadora.esCapicua(-555),
				"Los números negativos no se consideran capicúas "
				+ "en nuestro método.");
	}
	
	/**
	 * Prueba el método esPrimo de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número 0 
	 * debido a que el número cero se excluye para los números primos.
	 * @see Calculadora#esPrimo(int)
	 */
	@Test
	void testEsPrimo01() {
		assertFalse(Calculadora.esPrimo(0),
				"El número 0 se excluye para los números primos.");
	}
	
	/**
	 * Prueba el método esPrimo de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número 1 
	 * debido a que nuestro método no considera el uno como primo.
	 * @see Calculadora#esPrimo(int)
	 */
	@Test
	void testEsPrimo02() {
		assertFalse(Calculadora.esPrimo(1),
				"El número 1 NO es considerado primo en nuestro método.");
	}
	
	/**
	 * Prueba el método esPrimo de la clase Calculadora.
	 * Se verifica que el método devuelve true para el número 149, 
	 * que es un número primo.
	 * @see Calculadora#esPrimo(int)
	 */
	@Test
	void testEsPrimo03() {
		assertTrue(Calculadora.esPrimo(149),
				"El número 140 debe cumplir con la condición de primo.");
	}
	
	/**
	 * Prueba el método esPrimo de la clase Calculadora.
	 * Se verifica que el método devuelve false para el número 91, 
	 * ya que es divisible por 7 y 13.
	 * @see Calculadora#esPrimo(int)
	 */
	@Test
	void testEsPrimo04() {
		assertFalse(Calculadora.esPrimo(91),
				"El número 91 NO debe cumplir con la condición de primo "
				+ "dado que es divisible por 7 y 13.");
	}
	
	/**
	 * Prueba el método esPrimo de la clase Calculadora.
	 * Se verifica que el método devuelve false para los números 
	 * negativos, dado que no se consideran primos.
	 * @see Calculadora#esPrimo(int)
	 */
	@Test
	void testEsPrimo05() {
		assertFalse(Calculadora.esPrimo(-7),
				"El número -7 NO debe cumplir con la condición de primo "
				+ "dado que los números negativos no se consideran primos");
	}
	
	/**
	 * Prueba el método siguientePrimo de la clase Calculadora, 
	 * donde se espera que el siguiente número primo después del 
	 * número 8 sea el número 11.
	 * @see Calculadora#siguientePrimo(int)
	 */
	@Test
	void testSiguientePrimo01() {
		assertEquals(11, Calculadora.siguientePrimo(8),
				"El siguiente número primo después del número 8 "
				+ "debería ser el número 11.");
	}
	
	/**
	 * Prueba el método siguientePrimo de la clase Calculadora, 
	 * donde se espera que el siguiente número primo después de 
	 * aquellos números inferiores a dos sea el número 2.
	 * @see Calculadora#siguientePrimo(int)
	 */
	@Test
	void testSiguientePrimo02() {
		assertEquals(2, Calculadora.siguientePrimo(-10),
				"El siguiente número primo después del número -10 "
				+ "debería ser el número 2.");
	}
	
	/**
	 * Prueba el método siguientePrimo de la clase Calculadora. 
	 * Se verifica que el siguiente primo del número 13 sea 
	 * igual que el siguiente primo del número 16.
	 * @see Calculadora#siguientePrimo(int)
	 */
	@Test
	void testSiguientePrimo03() {
		assertTrue(Calculadora.siguientePrimo(13)
				== Calculadora.siguientePrimo(16),
				"El siguiente número primo después del número 13 "
				+ "debería ser igual que el siguiente número primo del número 16");
	}
	
	/**
	 * Prueba el método potencia de la clase Calculadora, 
	 * donde se espera que la potencia de base 5 y exponente 0 
	 * valga 1.
	 * @see Calculadora#potencia(double, double)
	 */
	@Test
	void testPotencia01() {
		assertEquals(1, Calculadora.potencia(5, 0),
				"La potencia de base 5 y exponente 0 debería de valer 1.");
	}
	
	/**
	 * Prueba el método potencia de la clase Calculadora. 
	 * Se verifica que la potencia de base 4 y exponente 0 
	 * sea igual que la potencia de base 1 y exponente 1.
	 * @see Calculadora#potencia(double, double)
	 */
	@Test
	void testPotencia02() {
		assertTrue(Calculadora.potencia(4, 0)
				== Calculadora.potencia(1, 1),
				"La potencia de base 4 y exponente 0 debería ser igual "
				+ "que la potencia de base 1 y exponente 1.");
	}
	
	/**
	 * Prueba el método potencia de la clase Calculadora, 
	 * donde se espera que la potencia de base -5 y exponente 3 
	 * valga -125.
	 * @see Calculadora#potencia(double, double)
	 */
	@Test
	void testPotencia03() {
		assertEquals(-125, Calculadora.potencia(-5, 3),
				"La potencia de base -5 y exponente 3 debería de valer -125.");
	}
	
	/**
	 * Prueba el método potencia de la clase Calculadora. 
	 * Se verifica que la potencia de base 4 y exponente -2 
	 * sea igual que el inverso de la potencia 
	 * de base 4 y exponente 2.
	 * @see Calculadora#potencia(double, double)
	 */
	@Test
	void testPotencia04() {
		assertTrue(Calculadora.potencia(4, -2)
				== 1 / Calculadora.potencia(4, 2),
				"La potencia de base 4 y exponente -2 debería ser igual "
			    + "al inverso de la potencia con base 4 y exponente 2.");
	}
	
	/**
	 * Prueba el método digitos de la clase Calculadora, 
	 * donde se espera que el número de dígitos del número 0
	 * sea 1.
	 * @see Calculadora#digitos(int)
	 */
	@Test
	void testCountDigits01() {
		assertEquals(1, Calculadora.digitos(0),
				"El número de dígitos del número 0 debería ser 1.");
	}
	
	/**
	 * Prueba el método digitos de la clase Calculadora, 
	 * donde se espera que el número de dígitos del número 0000005
	 * NO sea 7. Nuestro método no tiene en cuenta los ceros a la 
	 * izquierda del número entero.
	 * @see Calculadora#digitos(int)
	 */
	@Test
	void testCountDigits02() {
		assertNotEquals(7, Calculadora.digitos(0000005),
				"El número de dígitos del número 0000005 debería ser 1,"
				+ "dado que no tenemos en cuenta los ceros anteriores.");
	}
	
	/**
	 * Prueba el método digitos de la clase Calculadora. 
	 * Se verifica que el número de dígitos del número -22 es 
	 * igual que el número de dígitos del número 22.
	 * @see Calculadora#digitos(int)
	 */
	@Test
	void testCountDigits03() {
		assertTrue(Calculadora.digitos(-22)
				== Calculadora.digitos(22),
				"El número de dígitos del número -22 debería ser "
				+ "igual que el número de dígitos del número 22.");
	}

}
