package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la base imponible: ");
		float baseImponible = s.nextFloat();
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String tipoIva = s.next().toLowerCase();
		System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5, 5porc): ");
		String codPromocional = s.next().toLowerCase();
		double iva = 0;
		String porcIva = "";
		switch(tipoIva) {
		case "general":
			iva = baseImponible * 0.21;
			porcIva = "21%";
			break;
		case "reducido":
			iva = baseImponible * 0.10;
			porcIva = "10%";
			break;
		case "superreducido":
			iva = baseImponible * 0.04;
			porcIva = "4%";
			break;
		}
		float precioConIva = (float) (iva + baseImponible);
		double valorPromocion = 0;
		switch(codPromocional) {
		case "nopro":
			valorPromocion = 0;
			break;
		case "mitad":
			valorPromocion = precioConIva / 2;
			break;
		case "meno5":
			valorPromocion = precioConIva - 5;
			break;
		case "5porc":
			valorPromocion = precioConIva * 0.05;
			break;
		}
		float total = (float) (precioConIva - valorPromocion);
		System.out.printf("Base imponible\t\t%.2f\n", baseImponible);
		System.out.printf("IVA (%s)\t\t%.2f\n", porcIva, iva);
		System.out.printf("Precio con IVA\t\t%.2f\n", precioConIva);
		System.out.printf("Cod. promo. (%s)\t%.2f\n", codPromocional, valorPromocion);
		System.out.printf("TOTAL\t\t\t%.2f", total);
		s.close();

	}

}
