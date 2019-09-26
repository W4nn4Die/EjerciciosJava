package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero de horas trabajadas: ");
		int horas = s.nextInt();
		if (horas <= 40) {
			int salario = horas * 12;
			System.out.println("Tu salario es: " + salario);
		} else {
			horas = horas - 40; 
			int salarioBase = 40 * 12;
			int salarioExtra = horas * 16;
			int salarioTotal = salarioBase + salarioExtra;
			System.out.println("Tu salario total es: " + salarioTotal);
		}
		s.close();
	}

}
