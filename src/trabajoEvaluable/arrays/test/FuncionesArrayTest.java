/**
 * 
 */
package trabajoEvaluable.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import trabajoEvaluable.arrays.app.FuncionesArray;

/**
 * Clase que comprueba el funcionamiento de cada uno de los métodos 
 * de la Clase FuncionesArray.java a través de JUnit5.
 * @author Francisco Manuel Hernández 1ºDAW
 */
class FuncionesArrayTest {

	private int[] array = new int[] {11,33,5,33,11};
	private int[] array2 = new int[] {7,-33,-25,1,-11};
	private int[] array3 = new int[] {0,0,0};
	
	/**
	 * Prueba el método estaEnArrayInt de la clase FuncionesArray.
	 * Se verifica que el método devuelve true cuando se busca 
	 * el número 5 en el array proporcionado.
	 * @see FuncionesArray#estaEnArrayInt(int[], int)
	 */
	@Test
	void testEstaEnArrayInt01() {
		assertTrue(FuncionesArray.estaEnArrayInt(array, 5),
				"El número 5 debería estar presente en el array proporcionado.");
	}
	
	/**
	 * Prueba el método estaEnArrayInt de la clase FuncionesArray.
	 * Se verifica que el método devuelve false cuando se busca 
	 * el número 3 en el array proporcionado.
	 * @see FuncionesArray#estaEnArrayInt(int[], int)
	 */
	@Test
	void testEstaEnArrayInt02() {
		assertFalse(FuncionesArray.estaEnArrayInt(array, 3),
				"El número 3 NO debería estar presente en el array proporcionado.");
	}
	
	/**
	 * Prueba el método mediaArrayInt de la clase FuncionesArray.
	 * Se verifica que el método devuelve 18.6, 
	 * el valor de la media del array proporcionado.
	 * @see FuncionesArray#mediaArrayInt(int[])
	 */
	@Test
	void testMediaArrayInt01() {
		assertEquals(18.6, FuncionesArray.mediaArrayInt(array),
				"La media del array proporcionado debería ser 18.6");
	}
	
	/**
	 * Prueba el método mediaArrayInt de la clase FuncionesArray.
	 * Se verifica que el método devuelve -12.2, 
	 * el valor de la media del array proporcionado.
	 * @see FuncionesArray#mediaArrayInt(int[])
	 */
	@Test
	void testMediaArrayInt02() {
		assertEquals(-12.2, FuncionesArray.mediaArrayInt(array2),
				"La media del array proporcionado debería ser -12.2");
	}
	
	/**
	 * Prueba el método mediaArrayInt de la clase FuncionesArray.
	 * Se verifica que el método devuelve 0, 
	 * el valor de la media del array proporcionado.
	 * @see FuncionesArray#mediaArrayInt(int[])
	 */
	@Test
	void testMediaArrayInt03() {
		assertEquals(0, FuncionesArray.mediaArrayInt(array3),
				"La media del array proporcionado debería ser 0");
	}
	
	/**
	 * Prueba el método generaArrayInt de la clase FuncionesArray.
	 * Se verifica que el método genera dos arrays diferentes 
	 * con la misma longitud y mismos rangos de valores.
	 * @see FuncionesArray#generaArrayInt(int, int, int)
	 */
	@Test
	void testGeneraArrayInt01() {
		int[] a1 = FuncionesArray.generaArrayInt(3, 1, 10);
		int[] a2 = FuncionesArray.generaArrayInt(3, 1, 10);
		
		StringBuffer sb1 = new StringBuffer();
		for (int i : a1) {
			sb1.append(i);
		}
		
		StringBuffer sb2 = new StringBuffer();
		for (int i : a2) {
			sb2.append(i);
		}
		
		assertNotEquals(sb1.toString(), sb2.toString(),
				"Los arrays generados deberían ser diferentes.");
	}
	
	/**
	 * Prueba el método generaArrayInt de la clase FuncionesArray.
	 * Se verifica que el método genera dos arrays idénticos 
	 * con la misma longitud y mismos valores,
	 * ya que los valores mínimo y máximo son iguales.
	 * @see FuncionesArray#generaArrayInt(int, int, int)
	 */
	@Test
	void testGeneraArrayInt02() {
		int[] a1 = FuncionesArray.generaArrayInt(4, 3, 3);
		int[] a2 = FuncionesArray.generaArrayInt(4, 3, 3);
		
		StringBuffer sb1 = new StringBuffer();
		for (int i : a1) {
			sb1.append(i);
		}
		
		StringBuffer sb2 = new StringBuffer();
		for (int i : a2) {
			sb2.append(i);
		}
		
		assertEquals(sb1.toString(), sb2.toString(),
				"Los arrays generados deberían ser idénticos.");
	}

}
