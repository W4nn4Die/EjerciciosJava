package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		int totalImpar = 1;
		int sumaImpar = 0;
		int mayorPar = 0;
		int save = sumaImpar;
		while (num >= 0) {
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
				save = sumaImpar;
			}
			if (num < 0) {
				sumaImpar = save;
				totalImpar--;
			}
		}
		int mediaImpar = sumaImpar / (totalImpar);
		System.out.printf("Mayor de los pares: %d\nMedia de los impares: %d", mayorPar, mediaImpar);
		s.close();
	}

}
