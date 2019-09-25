package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la base del rectangulo: ");
		double base = s.nextDouble();
		System.out.print("Introduce la altura del rectangulo: ");
		double altura = s.nextDouble();
		double area = base * altura;
		System.out.printf("El area del rectangulo es: %.2f", area);
		s.close();

	}

}
