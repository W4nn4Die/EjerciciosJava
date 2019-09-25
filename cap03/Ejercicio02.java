package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de euros a convertir: ");
		double euros = s.nextDouble();
		double resultado = 166.39 * euros;
		System.out.printf("%.2f euros son %.2f pesetas", euros, resultado);
		s.close();

	}

}
