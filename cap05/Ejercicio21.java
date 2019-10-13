package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		int totalImpar = 1;
		int sumaImpar = 0;
		int mayorPar = 0;
		int save = 0;
		while (num >= 0) {
			save = sumaImpar;
			System.out.print("Introduce un numero: ");
			num = s.nextInt();
			int par = num % 2;
			if (par == 0) {
				if (num > mayorPar) {
					mayorPar = num;
				}
			} else {
				totalImpar++;
				sumaImpar = sumaImpar + num;
			}
			if (num < 0) {
				sumaImpar = save;
				if (par == 0) {
					totalImpar -= 1;
				} else {
					totalImpar -= 2;
				}
				
			}
		}
		int mediaImpar = sumaImpar / totalImpar;
		System.out.printf("Mayor de los pares: %d\nMedia de los impares: %d", mayorPar, mediaImpar);
		s.close();
	}

}
