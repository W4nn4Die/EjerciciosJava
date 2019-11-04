package com.iescampanillas.ejercicios;

public class Ejercicio09 {
  public static int cont = 0;
  public static void main(String[] args) {
	int valor = 0;
	while (valor != 24) {
	  valor = (int) (Math.random()*(100 - 0) + 1) + 0;
	  System.out.printf("%d\n", valor);
	  cont++;
	}
	System.out.println("Total de números generados: " + cont);

  }

}
