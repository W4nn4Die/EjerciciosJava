package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la altura de la L: ");
		int alt = s.nextInt();
		for (int i = 1; i<alt; i++) {
			System.err.println("*");
		}
		for (int i = 0; i<((alt/2)+1); i++) {
			System.out.print("* ");
		}
		
		s.close();
	}

}
