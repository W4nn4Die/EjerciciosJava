package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int num = s.nextInt();
		int longitud = String.valueOf(num).length();
		if (longitud > 5) {
			System.out.println("No se permiten numeros con mas de 5 digitos");
			System.exit(0);
		}
		int primerDigito = Integer.parseInt(Integer.toString(num).substring(0, 1));
		System.out.printf("El primer digito es: %d", primerDigito);
		
		s.close();
	}

}
