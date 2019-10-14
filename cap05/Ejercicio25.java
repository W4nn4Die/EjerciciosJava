package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero para verlo del reves: ");
		int num = s.nextInt();
		int backwards = 0;
		while (num != 0) {
			backwards = backwards * 10;
			backwards = backwards + (num%10);
			num /= 10;
		}
		System.out.println(backwards);
		s.close();
	}

}
