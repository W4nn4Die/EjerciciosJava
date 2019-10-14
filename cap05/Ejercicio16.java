package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero para ver si es primo: ");
		int isPrimo = s.nextInt();
		int mod = 0;
		int cont = 0;
		for (int i = 1; i<=isPrimo; i++) {
			mod = isPrimo % i;
			if (mod == 0) {
				cont += 1;
			}
		}
		if (cont == 2) {
			System.out.println(isPrimo + " es primo");
		} else {
			System.out.println(isPrimo + " no es primo");
		}
		s.close();
	}

}
