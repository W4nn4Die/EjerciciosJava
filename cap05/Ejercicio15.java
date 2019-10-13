package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero como base: ");
		int base = s.nextInt();
		System.out.print("Introduce un numero como exponente: ");
		int expo = s.nextInt();
		for (int i = 1; i<=expo; i++) {
			System.out.printf("%d^%d\n", base, i);
		}
		s.close();
	}

}
