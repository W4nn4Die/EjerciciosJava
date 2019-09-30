package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		double h = s.nextDouble();
		double formula = Math.sqrt((2 * h) / 9.81);
		System.out.print("La solucion es: " + formula);
		s.close();
	}

}
