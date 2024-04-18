package jUnit01.taxi.app;

import javax.swing.JOptionPane;

public class CalcularPago {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("¿Cuántos kilómetros ha realizado?");
		double kms = Double.parseDouble(str);
		JOptionPane.showMessageDialog(null, "El pago es " + calcularPago(kms) + "€");
	}
	
	/**
	 * 
	 * @param kms
	 * @return
	 */
	public static double calcularPago(double kms) {
		double cantidad = 20;
		
		while (kms <= 0) {
			String str = JOptionPane.showInputDialog("Introduzca una distancia superior a 0:");
			kms = Double.parseDouble(str);
		}
		
		if (kms > 30) {
			if (kms < 100) {
				cantidad += (kms - 30) * 0.6;
			} else {
				cantidad += ((100 - 30) * 0.6) + ((kms - 100) * 0.4);
			}
		}
		
		return cantidad;
	}

}
