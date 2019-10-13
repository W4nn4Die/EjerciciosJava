package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura de la piramide:");
		int alt = s.nextInt();
		System.out.print("Introduce el caracter para llenar la piramide: ");
		String relleno = s.next();
		int base = 1;
		int espacios = alt - 1;
		int vacio = 0;
		while (base <= alt) {
			for (int i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			System.out.print(relleno);
			for (int i = 1; i <= vacio; i++) {
				System.out.print(" ");
			}
			
			if (alt > 1) {
				System.out.print(relleno);
			}
			System.out.println();
			
			base++;
			espacios--;
			vacio += 2;
		}
		int dobleBase = base * 2;
		for (int i = 2; i<dobleBase; i++) {
			System.out.print(relleno);
		}
		s.close();
	}

}
