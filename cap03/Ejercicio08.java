package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero de horas trabajadas esta semana: ");
		double horas = s.nextDouble();
		double salarioSemana = horas * 12;
		System.out.printf("Tu salario esta semana es de: %.2f€", salarioSemana);
		s.close();
	}

}
