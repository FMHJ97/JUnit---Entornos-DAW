package calculadora.app;

public class Calculadora {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();

		System.out.println(calculadora.sumar(3, 4));
	}
	
	/**
	 * Constructor
	 */
	public Calculadora() {
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double sumar(double num1, double num2) {
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double restar(double num1, double num2) {
		return num1 - num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

}
