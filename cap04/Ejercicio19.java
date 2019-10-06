package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int num = s.nextInt();
		int longitud = (int) (Math.log10(Math.abs(num)) + 1);
		if (longitud > 5) {
			System.out.println("No puedes introducir mas de 5 digitos");
			System.exit(0);
		}
		System.out.printf("La cantidad de digitos es: %d", longitud);
		s.close();

	}

}
