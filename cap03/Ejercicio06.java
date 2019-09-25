package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la base del triangulo: ");
		double base = s.nextDouble();
		System.out.print("Introduce la altura del triangulo: ");
		double altura = s.nextDouble();
		double resultado = (base * altura) / 2;
		System.out.printf("El area del triangulo es: %.2f", resultado);
		s.close();

	}

}
