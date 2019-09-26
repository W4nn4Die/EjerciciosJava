package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero del 1 al 7: ");
		int dia = s.nextInt();
		if (dia < 1 || dia > 7) {
			System.out.print("No es un valor entre 1 y 7");
			s.close();
			return;
		} else {
			switch (dia) {
			case 1:
				System.out.print("Lunes");
				break;
			case 2:
				System.out.print("Martes");
				break;
			case 3:
				System.out.print("Miercoles");
				break;
			case 4:
				System.out.print("Jueves");
				break;
			case 5:
				System.out.print("Viernes");
				break;
			case 6:
				System.out.print("Sabado");
				break;
			case 7:
				System.out.print("Domingo");
				break;
			default:
				System.out.print("No deberías de ver esto");
				break;
			}
		}
		s.close();
	}

}
