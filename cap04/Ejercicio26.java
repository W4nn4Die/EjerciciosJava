package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Numero de entradas: ");
		int numEntradas = s.nextInt();
		System.out.print("Dia de la semana: ");
		String diaSemana = s.next().toLowerCase();
		System.out.print("¿Tiene tarjeta del cine? (s/n): ");
		String isTarjeta = s.next().toLowerCase();
		int base = 8;
		int espectadorBase = 5;
		float precioFinalPareja = 0;
		double aPagar = 0;
		int entradasParejas = 0;
		double precioInd = 0;
		switch (diaSemana) {
		case "miercoles":
			base = espectadorBase;
			precioInd = numEntradas * base;
			System.out.printf("Entradas individuales\t%d\n", numEntradas);
			System.out.printf("Precio por entrada individual\t%d\n", base);
			System.out.printf("Total\t\t%.2f", precioInd);
			if (isTarjeta.equals("s")) {
				double desc = 3.20;
				aPagar = precioInd - desc;
				System.out.printf("Descuento\t\t%.2f\n", desc);
				System.out.printf("A pagar\t\t%.2f\b", aPagar);
			} else {
				System.out.printf("Descuento\t\t%.2f\n", 0);
				System.out.printf("A pagar\t\t%.2f\b", precioInd);
			}
			break;
		case "jueves":
			base = 11;
			int pareja = numEntradas % 2;
			if (pareja == 0) {
				precioFinalPareja = numEntradas * 11;
				entradasParejas = numEntradas / 2;
				System.out.printf("Entradas pareja\t\t%d\n", entradasParejas);
				System.out.printf("Precio por entrada de pareja\t%.2f\n", 11);
				System.out.printf("Total\t\t%.2f\n", precioFinalPareja);
				if (isTarjeta.equals("s")) {
					double desc = 3.20;
					aPagar = precioFinalPareja - desc;
					System.out.printf("Descuento\t\t%.2f\n", desc);
					System.out.printf("A pagar\t\t%.2f\b", aPagar);
				} else {
					System.out.printf("Descuento\t\t%.2f\n", 0);
					System.out.printf("A pagar\t\t%.2f\b", precioFinalPareja);
				}
			} else {
				int separaPareja = numEntradas - 1;
				entradasParejas = numEntradas / 2;
				precioFinalPareja = separaPareja * 11;
				System.out.printf("Entradas pareja\t\t%d\n", entradasParejas);
				System.out.printf("Precio por entrada de pareja\t%.2f\n", 11);
				System.out.printf("Entradas individuales\t%d\n", 1);
				System.out.printf("Precio por entrada individual\t%d\n", 8);
				System.out.printf("Total\t\t%.2f\n", precioFinalPareja + 8);
				if (isTarjeta.equals("s")) {
					double desc = 3.20;
					aPagar = precioFinalPareja - desc;
					System.out.printf("Descuento\t\t%.2f\n", desc);
					System.out.printf("A pagar\t\t%.2f\b", aPagar);
				} else {
					System.out.printf("Descuento\t\t%.2f\n", 0);
					System.out.printf("A pagar\t\t%.2f\b", precioFinalPareja);
				}
			}
			break;
		default:
			precioInd = numEntradas * base;
			System.out.printf("Entradas individuales\t%d\n", numEntradas);
			System.out.printf("Precio por entrada individual\t%d\n", base);
			System.out.printf("Total\t\t%.2f", precioInd);
			if (isTarjeta.equals("s")) {
				double desc = 3.20;
				aPagar = precioInd - desc;
				System.out.printf("Descuento\t\t%.2f\n", desc);
				System.out.printf("A pagar\t\t%.2f\b", aPagar);
			} else {
				System.out.printf("Descuento\t\t%.2f\n", 0);
				System.out.printf("A pagar\t\t%.2f\b", precioInd);
			}
			break;
		}
		s.close();
	}

}
