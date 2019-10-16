package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		System.out.print("Digitos pares: ");
		int pos = 0;
		int reverse = 0;
		while (num != 0) {
		  reverse = reverse * 10;
		  reverse = reverse + (num%10);
		  num = num/10;
		  pos++;
		}
		int total = 0;
		int dig = 0;
		for (int i = 0; i < pos; i++) {
		  dig = reverse % 10;
		  if ((dig % 2) == 0) {
			System.out.print(dig + " ");
			total += dig;
		  }
		  reverse = reverse / 10;
		}
		System.out.println("Suma de los digitos pares: " + total);
		//
		s.close();
	}

}
