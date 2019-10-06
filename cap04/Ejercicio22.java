package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el dia de la semana: ");
		String dia = s.next();
		dia.toLowerCase();
		int diasAConvertir = 0;
		switch (dia) {
		case "lunes":
			diasAConvertir = 1;
			break;
		case "martes":
			diasAConvertir = 2;
			break;
		case "miercoles":
			diasAConvertir = 3;
			break;
		case "jueves":
			diasAConvertir = 4;
			break;
		case "viernes":
			diasAConvertir = 5;
		default:
			break;
		}
		int diasRestantes = 5 - diasAConvertir;
		//s.delimiter();
		s.useDelimiter(":|\n");
		System.out.print("Introduce una hora (15:45): ");
		int hora = s.nextInt();
		int minutos = s.nextInt();
		int restarHoras = 15 - hora;
		int isNegative = Integer.signum(restarHoras);
		if (isNegative == -1) {
			restarHoras = Integer.parseInt(Integer.toString(restarHoras).substring(1));
		}
		restarHoras = restarHoras * 60;
		int diaMinuto = diasRestantes * 1440;
		int minutosAViernes = 60 - minutos;
		int minutosFinales = diaMinuto + minutosAViernes + restarHoras;
		System.out.printf("Quedan %s", minutosFinales);
		s.close();

	}

}
