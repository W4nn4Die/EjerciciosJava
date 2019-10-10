package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String positivos = "";
		String negativos = "";
		for (int i = 0; i<10; i++) {
			System.out.print("Introduce un número: ");
			int num = s.nextInt();
			if (num < 0) {
				negativos = (String) negativos + " " + num;
			} else {
				positivos = (String) positivos + " " + num;
			}
		}
		System.out.printf("Numeros positivos: %s\n", positivos);
		System.out.printf("Numeros negativos: %s\n", negativos);
		s.close();
	}

}
