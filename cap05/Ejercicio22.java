package com.iescampanillas.ejercicios;

public class Ejercicio22 {

	public static boolean primo(int num) {
		int cont = 2;
		boolean flag = true;
		while ((flag) && cont != num) {
			if (num % cont == 0) {
				flag = false;
			}
			cont++;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (primo(i)) {
				System.out.println(i);
			}
		}

	}

}
