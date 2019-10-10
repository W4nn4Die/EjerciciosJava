package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero como base: ");
		int base = s.nextInt();
		System.out.print("Introduce un numero como exponente: ");
		int expo = s.nextInt();
		System.out.printf("La potencia es: %.0f", Math.pow(base, expo));
		s.close();
	}

}
