/**
 * 
 */
package trabajoEvaluable.calculadora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import trabajoEvaluable.calculadora.app.Calculadora;

/**
 * 
 */
class CalculadoraTest {

	@Test
	void testFactorial01() {
		assertEquals(Calculadora.factorialRecursivo(0)
				,1);
	}

}
