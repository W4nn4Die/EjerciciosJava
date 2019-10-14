package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero para empezar: ");
		int n1 = s.nextInt();
		System.out.print("Introduce un numero para usar como divisor: ");
		int n2 = s.nextInt();
		for (int i = n1; i>0; i--) {
			if ((i % n2) != 0) {
				System.out.println(i);
			}
		}
		s.close();
	}

}
