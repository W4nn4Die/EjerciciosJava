package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce 3 notas separadas con espacios: ");
		double nota1 = s.nextDouble();
		double nota2 = s.nextDouble();
		double nota3 = s.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("La media es: %.2f\n", media);
		switch ((int)media) {
		case 0: case 1: case 2: case 3: case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7: case 8:
			System.out.println("Notable");
			break;
		case 9: case 10:
			System.out.println("Sobresaliente");
			break;
			
		}
		s.close();

	}

}
