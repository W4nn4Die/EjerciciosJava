package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero positivo: ");
		int num = s.nextInt();
		if (num < 0) {
			num = 0;
		}
		int max = num + 100;
		for (int i = num; i <= max; i++) {
			System.out.println(i);
		}
		s.close();
	}

}
