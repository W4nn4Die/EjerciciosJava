package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de pesetas a convertir: ");
		double pesetas = s.nextDouble();
		double resultado = 0.005 * pesetas;
		System.out.printf("%.2f pesetas son %.2f euros", pesetas, resultado);
		s.close();

	}

}
