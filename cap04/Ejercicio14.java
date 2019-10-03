package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num1 = s.nextInt();
		int par = num1 % 2;
		int divEntre5 = num1 % 5;
		if (par == 0 && divEntre5 == 0) {
			System.out.println("Es par y divisible entre 5");
		} else if (par == 0 && !(divEntre5 == 0)) {
			System.out.println("Es par, pero no divisible entre 5");
		} else if (divEntre5 == 0 && !(par == 0)) {
			System.out.println("No es par, pero si divisible entre 5");
		} else {
			System.out.println("No es par ni divisible entre 5");
		}
		s.close();

	}

}
