package com.iescampanillas.ejercicios;

public class Ejercicio04 {

  public static void main(String[] args) {
	int[] numero = new int[19];
	int[] cuadrado = new int[19];
	int[] cubo = new int[19];
	int cont = 0;
	int random = 0;
	while (cont < 19) {
	  random = (int)(Math.random() * ((100 - 0) + 1)) + 0;
	  numero[cont] = random;
	  cont++;
	}
	cont = 0;
	for (int i: numero) {
	  cuadrado[cont] = (int) Math.pow(i, 2);
	  cubo[cont] = (int) Math.pow(i, 3);
	  cont++;
	}
	cont = 0;
	System.out.printf("%-10s %-10s %-10s\n", "numero", "cuadrado", "cubo");
	while (cont < 19) {
	  System.out.printf("%-10d %-10d %d\n", numero[cont], cuadrado[cont], cubo[cont]);
	  cont++;
	}

  }

}
