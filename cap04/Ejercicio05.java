package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el valor de a: ");
		double a = s.nextDouble();
		System.out.print("Introduce el valor de b: ");
		double b = s.nextDouble();
		if (a == 0 || b == 0) {
			System.out.print("Esta ecuacion no tiene solucion real");
			s.close();
			return;
		}
		double x = b / a;
		System.out.print("El resultado es: " + x);
		s.close();

	}

}
