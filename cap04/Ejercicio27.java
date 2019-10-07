package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		String sabor = s.next().toLowerCase();
		double precioBase = 0;
		double precioNata = 0;
		double precioNombre = 0;
		if (sabor.equals("chocolate")) {
			System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
			String tipoChoco = s.next().toLowerCase();
			if (tipoChoco.equals("negro")) {
				precioBase = 14;
				System.out.printf("Tarta de chocolate negro: %.2f€\n", precioBase);
			} else {
				precioBase = 15;
				System.out.printf("Tarta de chocolate blanco: %.2f€\n", precioBase);
			}
		} else if (sabor.equals("manzana")) {
			precioBase = 18;
			System.out.printf("Tarta de manzana: %.2f€\n", precioBase);
		} else if (sabor.equals("fresa")){
			precioBase = 16;
			System.out.printf("Tarta de fresa: %.2f€\n", precioBase);
		} else {
			System.exit(0);
		}
		System.out.print("¿Quiere nata?(s/n): ");
		String nata = s.next().toLowerCase();
		if (nata.equals("s")) {
			precioNata = 2.50;
			System.out.printf("Con nata: %.2f€\n", precioNata);
		}
		System.out.print("¿Quiere ponerle un nombre?(s/n): ");
		String nombre = s.next().toLowerCase();
		if (nombre.equals("s")) {
			precioNombre = 2.75;
			System.out.printf("Con nombre: %.2f€\n", precioNombre);
		}
		double total = precioBase + precioNata + precioNombre;
		System.out.printf("Total: %.2f€", total);
		s.close();
	}

}
