package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de Mb a convertir: ");
		double mb = s.nextDouble();
		double kb = mb * 8000;
		System.out.printf("%.6f Kb", kb);
		s.close();
	}

}
