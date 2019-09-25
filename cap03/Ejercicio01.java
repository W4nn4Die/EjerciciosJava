package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce dos numeros: ");
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		double resultado = num1 * num2;
		System.out.print("El resultado es: " + resultado);
		s.close();

	}

}
