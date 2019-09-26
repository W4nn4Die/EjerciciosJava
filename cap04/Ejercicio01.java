package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un dia de la semana: ");
		int dia = s.nextInt();
		switch (dia) {
		case 1:
			System.out.println("PRO");
			break;
		case 2:
			System.out.println("EDD");
			break;
		case 3:
			System.out.println("PRO");
			break;
		case 4: 
			System.out.println("PRO");
			break;
		case 5:
			System.out.println("SINF");
			break;
		default:
			System.out.println("Hoy no hay clases");
			break;
		}
		s.close();
	}

}
