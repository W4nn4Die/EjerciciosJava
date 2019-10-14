package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura de la piramide: ");
		int alt = s.nextInt();
		int cont = 1;
		int espacio = alt - 1;
		int i = 0;
		while (cont <= alt) {
			// Añade un espacio espacio delante del numero
			for (i = 1; i <= espacio; i++) {
				System.out.print(" ");
			}
			
			// Suma una a cada interaccion del bucle para hacer la primera
			// para hacer la primera parte de la piramide
			for (i = 1; i < cont; i++) {
				System.out.print(i);
			}
			
			// Recorre el numero introducido por pantalla hacia atrás 
			// para poder hacer la segunda parte de la piramide
			for (i = cont; i > 0; i--) {
				System.out.print(i);
			}
			
			// Imprimimos un salto de linea para pasar a otro nivel de la piramide
			System.out.println();
			// Añadimos uno mas al contador para que termine el bucle
			// y vamos restando el espacio que introducimos delante para que tenga la forma
			cont++;
			espacio--;
		}
		s.close();
	}

}
