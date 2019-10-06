package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int num = s.nextInt();
		System.out.printf("El último número es: %d", num % 10);
		s.close();

	}

}
