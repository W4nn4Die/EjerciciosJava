package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce 3 notas separadas con espacios: ");
		double nota1 = s.nextDouble();
		double nota2 = s.nextDouble();
		double nota3 = s.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("La media es: %.2f", media);
		s.close();

	}

}
