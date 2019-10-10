package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int num = 0;
		int suma = 0;
		int num1 = 0;
		for (i = 0;num>=0;i+=num) {
			num1 = suma;
			System.out.print("Introduce un numero para sumar\npara terminar introduce un numero negativo: ");
			num = s.nextInt();
			suma += num;
		}
		System.out.printf("La suma de todos los numeros es: %d", num1);
		s.close();
	}

}
