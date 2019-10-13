package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura de la piramide:");
		int alt = s.nextInt();
		System.out.print("Introduce el caracter para llenar la piramide: ");
		String relleno = s.next();
		int base = 1;
		int longitud = 1;
		int espacios = alt - 1;
		while (base <= alt) {
			for (int i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			
			for (int i = 1; i <= longitud; i++) {
				System.out.print(relleno);
			}
			System.out.println();
			
			base++;
			espacios--;
			longitud += 2;
		}
		s.close();
	}

}
