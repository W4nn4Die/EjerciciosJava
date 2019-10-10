package com.iescampanillas.ejercicios;
import java.util.Scanner; 

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		System.out.print("Introduce la cantidad de numberos de Fibonacci a imprimir: ");
		int max = s.nextInt();
		int inicial = 0;
		int num2 = 1;
		int guarda = 0;
		switch (max) {
		case 1:
			System.out.println(0);
			break;
		case 2:
			System.out.println("0 1");
			break;
		default:
			System.out.print("0 1");
			for (i=3;i<=max;i++) {
				guarda = inicial;
				inicial = num2;
				num2 = num2 + guarda;
				System.out.printf(" %d", num2);
			}
		}
		s.close();
	}

}
