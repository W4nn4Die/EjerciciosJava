package com.iescampanillas.ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		int cont = 0;
		while (cont<=100) {
			int good = cont % 5;
			if (good == 0) {
				System.out.println(cont);
			}
			cont += 1;
		}

	}

}
