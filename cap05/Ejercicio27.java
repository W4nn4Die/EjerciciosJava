package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero como limite: ");
		int num = s.nextInt();
		for (int i = 1; i<=num; i++) {
			if ((i%3) == 0) {
				System.out.println(i);
			}
		}
		s.close();
	}

}
