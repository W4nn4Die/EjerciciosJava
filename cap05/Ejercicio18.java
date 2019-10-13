package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1 = s.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2 = s.nextInt();
		if (num1 > num2) {
			System.out.printf("El primer numero (%d) no puede ser más grande que el segundo numero (%d)", num1, num2);
			System.exit(0);
		}
		for (int i = num1; i<=num2; i+=7) {
			System.out.println(i);
		}
		s.close();
	}

}
