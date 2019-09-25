package com.iescampanillas.ejercicios;

public class Ejercicio06 {

	public static void main(String[] args) {
		double baseImponible = 154;
		double iva = baseImponible * 0.21;
		double resultado = iva + baseImponible;
		System.out.printf("El precio final es: %.2f", resultado);

	}

}
