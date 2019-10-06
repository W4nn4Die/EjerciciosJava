package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nota del primer control: ");
		float nota1 = s.nextFloat();
		System.out.print("Nota del segundo control: ");
		float nota2 = s.nextFloat();
		float media = (nota1 + nota2) / 2;
		float notaFinal = media;
		if (media <= 5.0) {
			System.out.print("¿Cual ha sido el resultado de la recuperación? (apto/no apto): ");
			String recu = s.next();
			if (recu.equals("apto")) {
				notaFinal = 5;
			} else {
				notaFinal = media;
			}
		}
		System.out.printf("Tu nota de Programacion es %.1f", notaFinal);
		s.close();

	}

}