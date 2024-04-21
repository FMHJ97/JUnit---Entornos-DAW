package jUnit01.temperatura.app;

import javax.swing.JOptionPane;

public class Temperatura {

	/**
	 * Método Principal.
	 * @param args
	 */
	public static void main(String[] args) {
		double temperatura;
		do {
			String str = JOptionPane.showInputDialog("Introduzca la temperatura actual:");
			temperatura = Float.parseFloat(str);
		} while (temperatura <= -20 || temperatura >= 50);
		
		JOptionPane.showMessageDialog(null,
				"El deporte recomendado es: " + sportByTempt(temperatura));
	}
	
	/**
	 * Método que recomienda un deporte según la temperatura introducida.
	 * @param num Temperatura.
	 * @return String nombre deporte.
	 */
	public static String sportByTempt(double num) {
		String deporte = "Esquí";
		if (num > 5) {
			if (num > 16) {
				if (num > 22) {
					if (num > 30) {
						return deporte = "Natación";
					}
					return deporte = "Tenis";
				}
				return deporte = "Fútbol";
			}
			return deporte = "Ajedrez";
		}
		return deporte;
	}

}
