package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter(":|\n");
		System.out.print("Introduce la hora y los minutos (ej: 18:45): ");
		//System.out.print("delimiter " + s.delimiter());
		int horas = s.nextInt();
		int horasASegundos = (24 - horas) * 3600;
		int minutos = s.nextInt();
		int minutosASegundos = (60 - minutos) * 60;
		if (horas >= 24 || minutos >= 60) {
			horas = 23;
			minutos = 59;
		}
		System.out.printf("Faltan %d segundos para llegar a medianoche", horasASegundos + minutosASegundos );
		
		s.close();

	}

}
