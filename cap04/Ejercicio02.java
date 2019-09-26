package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la hora: ");
		int hora = s.nextInt();
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias");			
		}
		else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		}
		else if (hora >= 21 && hora <= 5) {
			System.out.println("Buenas noches");
		}
		s.close();
	}

}
