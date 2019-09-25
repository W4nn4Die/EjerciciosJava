package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la nota del primer examen: ");
		double notaPrimero = s.nextDouble();
		System.out.print("¿Que nota quieres tener en el trimestre? ");
		double notaDeseada = s.nextDouble();
		double notaNecesaria = ((100 * notaDeseada) - (40 * notaPrimero)) / 60;
		System.out.printf("Necesita un %.1f para tener un %.1f en el trimestre", notaNecesaria, notaDeseada);
		s.close();

	}

}
