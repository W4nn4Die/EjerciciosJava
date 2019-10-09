package com.iescampanillas.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("Introduce un numero para hacer la tabla: ");
			int num = s.nextInt();
			int i;
			for (i=0; i<=10; i++) {
				System.out.printf("%d x %d = %d\n", i, num, i * num);
			}
			} catch (InputMismatchException e) {
			System.out.println("Debes introducir un numero entero");
			}
		s.close();
		}
	
	}
