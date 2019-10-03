package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
	final static void clearConsole() {
		System.out.println("\033[H\033[2J");
	}
	final static void tOrF() {
		System.out.println("1: Verdadero");
		System.out.println("2: Falso");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("En Java nunca tenemos que cerrar los if");
		tOrF();
		int resp1 = s.nextInt();
		clearConsole();
		System.out.println("No podemos subir archivos a GitHub desde la terminal");
		tOrF();
		int resp2 = s.nextInt();
		clearConsole();
		System.out.println("En Java debemos definir de que tipo es la variable");
		tOrF();
		int resp3 = s.nextInt();
		clearConsole();
		System.out.println("Podemos ejecutar un programa Java sin tener que compilarlo");
		tOrF();
		int resp4 = s.nextInt();
		clearConsole();
		System.out.println("En nuestro código HTML no podemos meter CSS, debemos hacerlo desde otro fichero");
		tOrF();
		int resp5 = s.nextInt();
		clearConsole();
		System.out.println("En Java las variables pueden empezar con un número");
		tOrF();
		int resp6 = s.nextInt();
		clearConsole();
		System.out.println("En una tabla solo podemos tener una FK");
		tOrF();
		int resp7 = s.nextInt();
		clearConsole();
		System.out.println("Necesitamos instalar el JDK para ejecutar nuestro código Java");
		tOrF();
		int resp8 = s.nextInt();
		clearConsole();
		System.out.println("Si ponemos un if no es obligatorio poner un else al final");
		tOrF();
		int resp9 = s.nextInt();
		clearConsole();
		System.out.println("Solo podemos realizar conexiones al puerto 3306 si es local, si nos conectamos a una ip pública al puerto 3306 no nos dejará");
		tOrF();
		int resp10 = s.nextInt();
		clearConsole();
		int puntosTotales = 0;
		if (resp1 == 1) {
			--puntosTotales;
		} else {
			++puntosTotales;
		} 
		if (resp2 == 1) {
			--puntosTotales;
		} else {
			++puntosTotales;
		}
		if (resp3 == 1) {
			++puntosTotales;
		} else {
			--puntosTotales;
		}
		if (resp4 == 1) {
			--puntosTotales;
		} else {
			++puntosTotales;
		}
		if (resp5 == 1) {
			--puntosTotales;
		} else {
			++puntosTotales;
		}
		if (resp6 == 1) {
			--puntosTotales;
		} else {
			++puntosTotales;
		}
		if (resp7 == 1) {
			--puntosTotales;
		} else {
			++puntosTotales;
		}
		if (resp8 == 1) {
			++puntosTotales;
		} else {
			--puntosTotales;
		}
		if (resp9 == 1) {
			++puntosTotales;
		} else {
			--puntosTotales;
		}
		if (resp10 == 1) {
			++puntosTotales;
		} else {
			--puntosTotales;
		}
		System.out.println("Tus puntos totales son: " + puntosTotales);
		s.close();
	}

}
