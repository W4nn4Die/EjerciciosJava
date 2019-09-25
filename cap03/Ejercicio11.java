package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de Kb a convertir: ");
		double kb = s.nextDouble();
		double mb = kb / 8000;
		System.out.printf("%.6f Mb", mb);
		s.close();
	}

}
