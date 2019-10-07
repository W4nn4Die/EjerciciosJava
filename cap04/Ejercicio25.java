package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la altura de la bandera en cm: ");
		int altura = s.nextInt();
		System.out.print("Introduzca el ancho de la bandera: ");
		int ancho = s.nextInt();
		System.out.print("¿Quieres escudo bordado? (s/n): ");
		String bordado = s.next().toLowerCase();
		int cmCuadrado = altura * ancho;
		double valorBandera = cmCuadrado * 0.01;
		double valorBordado = 0;
		String escudo = "";
		switch(bordado) {
		case "s":
			valorBordado = 2.50;
			escudo = "Con escudo";
			break;
		case "n":
			valorBordado = 0;
			escudo = "Sin escudo";
			break;
		}
		System.out.println("Desglose de la compra: ");
		System.out.printf("Bandera de %d cm2\t%.2f\n", cmCuadrado, valorBandera);
		System.out.printf("%s\t\t%.2f\n", escudo, valorBordado);
		System.out.printf("Gastos de envio\t\t%.2f\n", 3.25);
		System.out.printf("Total\t\t\t%.2f", valorBandera + valorBordado + 3.25);
		s.close();

	}

}
