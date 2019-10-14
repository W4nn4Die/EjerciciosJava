package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero para calcular su factorial: ");
		int num = s.nextInt();
		double fact = 1;
		for (int i = 1; i<=num; i++) {
			fact *= i;
		}
		System.out.printf("El factorial de %d es: %.0f", num, fact);
		s.close();
	}

}
