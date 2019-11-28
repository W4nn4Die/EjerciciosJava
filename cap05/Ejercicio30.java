package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor, introduzca la primera hora.");
		System.out.println("Dia: ");
		String dia = s.next().toLowerCase();
		System.out.println("Hora: ");
		int hora = s.nextInt();
		
		System.out.println("Por favor, introduzca la segunda hora.");
		System.out.println("Dia: ");
		String dia2 = s.next().toLowerCase();
		System.out.println("Hora: ");
		int hora2 = s.nextInt();
		
		int diaNum = 0;
		switch (dia) {
		case "lunes":
			diaNum = 1;
			break;
		case "martes":
			diaNum = 2;
			break;
		case "miercoles":
			diaNum = 3;
			break;
		case "jueves":
			diaNum = 4;
			break;
		case "viernes":
			diaNum = 5;
			break;
		case "sabado":
			diaNum = 6;
			break;
		case "domingo":
			diaNum = 7;
			break;
		default:
		  	diaNum = 1;
		  	break;
		}
		
		int diaNum2 = 0;
		switch (dia2) {
		case "lunes":
			diaNum2 = 1;
			break;
		case "martes":
			diaNum2 = 2;
			break;
		case "miercoles":
			diaNum2 = 3;
			break;
		case "jueves":
			diaNum2 = 4;
			break;
		case "viernes":
			diaNum2 = 5;
			break;
		case "sabado":
			diaNum2 = 6;
			break;
		case "domingo":
			diaNum2 = 7;
			break;
		default:
		  	diaNum2 = 1;
		}
		int horasTotales = ((diaNum2 * 24) + hora2) - ((diaNum * 24) + hora);
		System.out.printf("Entre las %d:00H del %s y las %d:00H del %s hay %d hora/s", hora, dia, hora2, dia2, horasTotales);
		
		s.close();
	}

}
