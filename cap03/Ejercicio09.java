package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el radio del cono en metros: ");
		double radio = s.nextDouble() * 2;
		System.out.print("Introduce la altura del cono en metros: ");
		double altura = s.nextDouble();
		double volumen = (3.1415 * radio * altura) / 3;
		System.out.printf("El volumen del cono es de: %.2f m", volumen);
		s.close();
	}

}
