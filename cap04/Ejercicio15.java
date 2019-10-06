package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
	
	public static void piramideArriba(String x) {
		System.out.printf("  %s  \n", x);
		System.out.printf(" %s%s%s \n", x, x, x);
		System.out.printf("%s%s%s%s%s\n", x, x, x, x, x);
	}
	public static void piramideAbajo(String x) {
		System.out.printf("%s%s%s%s%s\n", x, x, x, x, x);
		System.out.printf(" %s%s%s \n", x, x, x);
		System.out.printf("  %s  \n", x);
	}
	public static void piramideDerecha(String x) {
		System.out.printf("%s\n", x);
		System.out.printf("%s%s\n", x, x);
		System.out.printf("%s%s%s\n", x, x, x);
		System.out.printf("%s%s\n", x, x);
		System.out.printf("%s\n", x);
	}
	public static void piramideIzquierda(String x) {
		System.out.printf("  %s\n", x);
		System.out.printf(" %s%s\n", x, x);
		System.out.printf("%s%s%s\n", x, x, x);
		System.out.printf(" %s%s\n", x, x);
		System.out.printf("  %s\n", x);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un carácter para hacer la pirámide: ");
		String piraChar = s.nextLine();
		System.out.println("Introduce una de las siguientes opciones: ");
		System.out.println("1) Arriba");
		System.out.println("2) Abajo");
		System.out.println("3) Derecha");
		System.out.println("4) Izquierda");
		System.out.print("Opción: ");
		int opt = s.nextInt();
		switch(opt) {
		case 1:
			piramideArriba(piraChar);
			break;
		case 2:
			piramideAbajo(piraChar);
			break;
		case 3:
			piramideDerecha(piraChar);
			break;
		case 4:
			piramideIzquierda(piraChar);
			break;
		default:
			System.out.println("No existe la opción " + opt + ", introduce una opcion válida");
			main(args);
		}
		
		s.close();

	}

}
