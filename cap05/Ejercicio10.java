package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		int num1 = 0;
		int total = 0;
		for (@SuppressWarnings("unused")int i = 0;num>=0;i+=num) {
			num1 = suma;
			total++;
			System.out.print("Introduce un numero para sumar\npara terminar introduce un numero negativo: ");
			num = s.nextInt();
			suma += num;
		}
		total = total -1;
		System.out.printf("La media de todos los numeros es: %d", num1 / total);
		s.close();
		
	}

}
