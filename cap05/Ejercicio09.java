package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		int max = Integer.toString(num).length() - 1;
		int i = 0;
		for (i = 0; i <= max; i++) {
			num = num / 10;
		}
		System.out.printf("El numero tiene %d digitos", i);
		s.close();

	}

}
