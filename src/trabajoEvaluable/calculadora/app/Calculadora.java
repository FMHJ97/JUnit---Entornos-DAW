package trabajoEvaluable.calculadora.app;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Método que genera y devuelve el factorial de un número entero.
	 * @param num Número entero que deseamos conocer su factorial.
	 * @return Devuelve el valor factorial de un entero.
	 */
	private static int factorialRecursivo(int n) {
		Scanner sc = new Scanner(System.in);
		while (n < 0) {
			System.out.println("Error. Introduzca un número mayor de 0:");
			n = sc.nextInt();
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorialRecursivo(n - 1);
	}
	
	/**
	 * Método que cuenta el número de dígitos de un número entero.
	 * @param num El entero que deseamos conocer la cantidad de dígitos.
	 * @return Devuelve el número de dígitos.
	 */
	private static int countDigits(int num) {
		//Declaro variables e inicializo contador a cero.
		int contador = 0;
		//Un bucle while para hallar el número de dígitos.
		while (num != 0) {
			num /= 10; // Elimina el último dígito.
			contador++; //Por cada iteración, contamos un dígito.
		}
		return contador;
	}
	
	/**
	 * Método que comprueba si un número es primo o compuesto, e imprime en pantalla
	 * la respuesta.
	 * @param num Número natural (> 1).
	 */
	private static boolean esNumPrimo(int num) {
		Scanner sc = new Scanner(System.in);
		boolean esPrimo = true;
		
		// Un número primo es un número natural mayor que 1.
		// Por tanto, el número 1 no se considera ni primo ni compuesto.
		if (num <= 1) {
			return esPrimo = false;
		}
		
		int divisor = 2;
		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				esPrimo = false;
				return esPrimo;
			}
			divisor++;
		}
		
		return esPrimo;
	}
	
	/**
	 * Método que devuelve el siguiente número primo.
	 * @param num
	 * @return siguiente número primo.
	 */
	private static int siguientePrimo(int num) {
		num++;
		while (!esNumPrimo(num)) {
			num++;
		}
		return num;
	}
	
	/**
	 * 
	 * @param base
	 * @param exp
	 * @return
	 */
	private static double potenciaEntero(int base, int exp) {
		return Math.pow(base, exp);
	}

}
