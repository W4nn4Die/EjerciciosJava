package com.iescampanillas.ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		int cont = 0;
		do {
			int good = cont % 5;
			if (good == 0) {
				System.out.println(cont);
			}
			cont += 1;
		} while (cont <= 100);

	}

}
