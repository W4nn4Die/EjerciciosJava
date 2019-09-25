package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la base imponible");
		double baseImponible = s.nextDouble();
		double iva = baseImponible * 0.21;
		double resultado = baseImponible + iva;
		System.out.printf("El precio final es: %.2f", resultado);
		s.close();

	}

}
