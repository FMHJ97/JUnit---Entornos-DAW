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
	 * Prueba el método factorialRecursivo de la clase Calculadora, 
	 * donde se espera que el factorial de 0 sea 1.
	 * @see Calculadora#factorialRecursivo(int)
	 */
	@Test
	void testFactorial01() {
		assertEquals(1, Calculadora.factorialRecursivo(0));
	}
	
	/**
	 * Prueba el método factorialRecursivo de la clase Calculadora 
	 * para verificar si el factorial de 0 es igual al factorial de 1.
	 * @see Calculadora#factorialRecursivo(int)
	 */
	@Test
	void testFactorial02() {
		assertTrue(Calculadora.factorialRecursivo(0) 
				== Calculadora.factorialRecursivo(1),
				"El factorial de 0 debe ser igual al factorial de 1.");
	}
	
	/**
	 * Prueba el método factorialRecursivo de la clase Calculadora, 
	 * donde se espera que el factorial de 5 sea 120.
	 * @see Calculadora#factorialRecursivo(int)
	 */
	@Test
	void testFactorial03() {
		assertEquals(120, Calculadora.factorialRecursivo(5));
	}
	
	/**
	 * Prueba el método esNumeroCapicua de la clase Calculadora 
	 * para verificar si el número 10101 es capicúa.
	 * @see Calculadora#esNumeroCapicua(int)
	 */
	@Test
	void testCapicua01() {
		assertTrue(Calculadora.esNumeroCapicua(10101),
				"El número 10101 debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esNumeroCapicua de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número 15243451.
	 * @see Calculadora#esNumeroCapicua(int)
	 */
	@Test
	void testCapicua02() {
		assertFalse(Calculadora.esNumeroCapicua(15243451),
				"El número 15243451 NO debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esNumeroCapicua de la clase Calculadora. 
	 * Se verifica que el método devuelve true para el número 0.
	 * @see Calculadora#esNumeroCapicua(int)
	 */
	@Test
	void testCapicua03() {
		assertTrue(Calculadora.esNumeroCapicua(0),
				"El número 0 debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esNumeroCapicua de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número -555 
	 * debido a que los números negativos no se consideran capicúas 
	 * en nuestro método.
	 * @see Calculadora#esNumeroCapicua(int)
	 */
	@Test
	void testCapicua04() {
		assertFalse(Calculadora.esNumeroCapicua(-555),
				"El número -555 NO debe cumplir con la condición de capicúa.");
	}
	
	/**
	 * Prueba el método esNumPrimo de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número 0 
	 * debido a que el número cero se excluye para los números primos.
	 * @see Calculadora#esNumPrimo(int)
	 */
	@Test
	void testEsPrimo01() {
		assertFalse(Calculadora.esNumPrimo(0),
				"El número 0 se excluye para los números primos.");
	}
	
	/**
	 * Prueba el método esNumPrimo de la clase Calculadora. 
	 * Se verifica que el método devuelve false para el número 1 
	 * debido a que nuestro método no considera el uno como primo.
	 * @see Calculadora#esNumPrimo(int)
	 */
	@Test
	void testEsPrimo02() {
		assertFalse(Calculadora.esNumPrimo(1),
				"El número 1 NO es considerado primo en nuestro método.");
	}
	
	/**
	 * Prueba el método esNumPrimo de la clase Calculadora.
	 * Se verifica que el método devuelve true para el número 149, 
	 * que es un número primo.
	 * @see Calculadora#esNumPrimo(int)
	 */
	@Test
	void testEsPrimo03() {
		assertTrue(Calculadora.esNumPrimo(149),
				"El número 140 debe cumplir con la condición de primo.");
	}
	
	/**
	 * Prueba el método esNumPrimo de la clase Calculadora.
	 * Se verifica que el método devuelve false para el número 91, 
	 * ya que es divisible por 7 y 13.
	 * @see Calculadora#esNumPrimo(int)
	 */
	@Test
	void testEsPrimo04() {
		assertFalse(Calculadora.esNumPrimo(91),
				"El número 91 NO debe cumplir con la condición de primo "
				+ "dado que es divisible por 7 y 13.");
	}

}
