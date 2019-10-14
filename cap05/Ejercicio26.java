package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num1 = s.nextInt();
		System.out.print("Introduce un digito: ");
		int dig = s.nextInt();
		System.out.printf("El digito %d aparece dentro del numero %d, en las posiciones: ", dig, num1);
		int pos = 1;
		int save = num1;
		while (save > 0) {
			if ((save % 10) == dig) {
				System.out.print(pos + " ");
			}
			save = save / 10;
			pos++;
		}
		s.close();
	}

}
