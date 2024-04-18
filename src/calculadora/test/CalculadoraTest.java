/**
 * 
 */
package calculadora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculadora.app.Calculadora;

/**
 * 
 */
class CalculadoraTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Comienzo de sesión test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Comienzo de Test");
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void setUp2() throws Exception {
		System.out.println("Final de Test");
	}

	@Test
	void testSumar() {
		double numero1 = 1;
		double numero2 = 2;
		Calculadora calc = new Calculadora();

		assertEquals(calc.sumar(numero1, numero2), 3);
	}
	
	@Test
	void testRestar() {
		double numero1 = 4;
		double numero2 = 2;
		Calculadora calc = new Calculadora();

		assertEquals(calc.restar(numero1, numero2), 2);
	}
	
	@Test
	@Disabled
	void assertTrue() {
		Assertions.assertTrue(5 > 2);
	}
	
	@Test
	@Disabled
	void testAssertFalse() {
		int expected = 3;
		int actual = 1+1;
		assertFalse(expected < actual);
	}
	
	@Test
	@Disabled
	void testAssertSame(){
		String nombre1 ="Miguel";
		String nombre2 ="Miguel";
		assertSame(nombre1,nombre2);
	}
	
	@Test
	@Disabled
	void testAssertSame2(){
		String numero1 ="3";
		int numero2 =3;
		assertSame(numero1,numero2, "No es lo mismo");
	}
	
	@Test
	@DisplayName(value = "Test Operaciones Calculadora")
	void grupoDeAssertions() {
	
		Calculadora calc = new Calculadora();
	
		assertAll("números",
			() -> assertEquals(8, calc.sumar(3, 5)),
			() -> assertEquals(-2, calc.restar(3, 5)),
			() -> assertEquals(2, calc.dividir(10, 5)),
			() -> assertEquals(15, calc.multiplicar(3, 5))
		);
	}

}
