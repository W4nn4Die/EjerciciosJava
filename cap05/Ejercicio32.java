package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		int save = num;
		System.out.print("Digitos pares: ");
		while (save > 0) {
			if (((save % 10) % 2) == 0) {
				System.out.print(save);
			}
			save = save / 10;
		}
		s.close();
	}

}
