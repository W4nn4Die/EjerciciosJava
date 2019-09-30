package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el dia de tu nacimiento: ");
		int diaNacimiento = s.nextInt();
		System.out.print("Introduce el mes de tu nacimiento: ");
		String mesNacimiento = s.next();
		switch (mesNacimiento) {
		case "enero":
			if (diaNacimiento <= 20) {
				System.out.println("Capricornio");
			} else {
				System.out.println("Acuario");
			}
			break;
		case "febrero":
			if (diaNacimiento <= 19) {
				System.out.println("Acuario");
			} else {
				System.out.println("Piscis");
			}
			break;
		case "marzo":
			if (diaNacimiento <= 20) {
				System.out.println("Piscis");
			} else {
				System.out.println("Aries");
			}
			break;
		case "abril":
			if (diaNacimiento <= 20) {
				System.out.println("Aries");
			} else {
				System.out.println("Tauro");
			}
			break;
		case "mayo":
			if (diaNacimiento <= 21) {
				System.out.println("Tauro");
			} else {
				System.out.println("Géminis");
			}
			break;
		case "junio":
			if (diaNacimiento <= 21) {
				System.out.println("Géminis");
			} else {
				System.out.println("Cáncer");
			}
			break;
		case "julio":
			if (diaNacimiento <= 23) {
				System.out.println("Cáncer");
			} else {
				System.out.println("Leo");
			}
			break;
		case "agosto":
			if (diaNacimiento <= 23) {
				System.out.println("Leo");
			} else {
				System.out.println("Virgo");
			}
			break;
		case "septiembre":
			if (diaNacimiento <= 23) {
				System.out.println("Virgo");
			} else {
				System.out.println("Libra");
			}
			break;
		case "octubre":
			if (diaNacimiento <= 23) {
				System.out.println("Libra");
			} else {
				System.out.println("Escorpio");
			}
			break;
		case "noviembre":
			if (diaNacimiento <= 22) {
				System.out.println("Escorpio");
			} else {
				System.out.println("Sagitario");
			}
			break;
		case "diciembre":
			if (diaNacimiento <= 21) {
				System.out.println("Sagitario");
			} else {
				System.out.println("Capricornio");
			}
			break;
		}
		s.close();

	}

}
