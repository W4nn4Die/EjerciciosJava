package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		System.out.println("Numero\t\tCuadrado\tCubo");
		int i = 0;
		num++;
		int max = num + 5;
		for (i=num;i<max;i++) {
			System.out.printf("%d\t\t%.0f\t\t%.0f\n", i, Math.pow(i, 2),Math.pow(i, 3));
		}
		s.close();
	}

}
