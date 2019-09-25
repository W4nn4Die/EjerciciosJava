package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce dos numeros: ");
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		System.out.printf("Suma: %.0f\nResta: %.0f\nMultiplicacion: %.0f\n" 
		+ "Division: %.0f", (num1 + num2), (num1 - num2), (num1 * num2), (num1 / num2));
		s.close();

	}

}
