package com.iescampanillas.ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		int i;
		for (i=0; i<=100; i++) {
			int good = i % 5;
			if (good == 0) {
				System.out.println(i);
			}
		}

	}

}
