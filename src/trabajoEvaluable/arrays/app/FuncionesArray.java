package trabajoEvaluable.arrays.app;

public class FuncionesArray {

	/**
	 * Método Principal.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[] {33,22,11,22,33};
		
		imprimeArray(generaArrayInt(5, 1, 10));
//		System.out.println(mediaArrayInt(array));
//		System.out.println(estaEnArrayInt(array, 11));
	}
	
	/**
	 * Método que imprime por pantalla los valores de un array int.
	 * @param array Array int.
	 */
	public static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i]);
			}
		}
	}
	
	/**
	 * Genera un array de tamaño n con números aleatorios 
	 * dentro de un intervalo (mínimo y máximo).
	 * @param longitud Longitud del Array
	 * @param inf Límite inferior
	 * @param sup Límite superior
	 * @return Array Int
	 */
	public static int[] generaArrayInt(int longitud,
			int inf, int sup) {

		int[] a = new int[longitud];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * (sup - inf)) + inf;
		}
		return a;
	}
	
	/**
	 * Método que obtiene la media de un array int.
	 * @param array Array Int
	 * @return Double Media del Array.
	 */
	public static double mediaArrayInt(int[] array) {
		double suma = 0;
		for (int i : array) {
			suma += i;
		}
		return suma / array.length;
	}
	
	/**
	 * Método que comprueba si un número está o no dentro de un array.
	 * @param array Array int.
	 * @param num Número a comprobar.
	 * @return True, existe. False, no existe.
	 */
	public static boolean estaEnArrayInt(int[] array, int num) {
		boolean existe = false;
		for (int i : array) {
			if (i == num) {
				return existe = true;
			}
		}
		return existe;
	}

}
