package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
		String comer = s.next().toLowerCase();
		String comerStr = "";
		double comerPrecio = 0;
		if (comer.equals("pitufo")) {
			System.out.print("¿Con que se ha tomado el pitufo? (aceite o tortilla): ");
			String pituMas = s.next().toLowerCase();
			if (pituMas.equals("aceite")) {
				comerPrecio = 1.20;
				comerStr = "Pitufo con aceite";
			} else {
				comerPrecio = 1.60;
				comerStr = "Pitufo con tortilla";
			}
		} else if (comer.equals("donut")) {
			comerPrecio = 1;
			comerStr = "Donut";
		} else {
			comerPrecio = 1.40;
			comerStr = "Palmera";
		}
		System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
		String bebida = s.next().toLowerCase();
		String bebidaStr = "";
		double bebidaPrecio = 0;
		if (bebida.equals("zumo")) {
			bebidaPrecio = 1.50;
			bebidaStr = "Zumo";
		} else {
			bebidaPrecio = 1.20;
			bebidaStr = "Cafe";
		}
		System.out.printf("%s: %.2f\n", comerStr, comerPrecio);
		System.out.printf("%s: %.2f\n", bebidaStr, bebidaPrecio);
		System.out.printf("Total desayuno: %.2f", comerPrecio + bebidaPrecio);
		s.close();
	}

}
