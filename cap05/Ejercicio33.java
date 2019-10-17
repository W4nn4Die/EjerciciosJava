package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio33 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduce la altura de la U: ");
	int alt = s.nextInt();
	int lados = alt - 1;
	int distancia = lados - 1;
	int cont = 0;
	while (cont < lados) {
	  System.out.print("*");
	  for (int i = 0; i <= distancia; i++) {
		System.out.print(" ");
	  }
	  System.out.print("*");
	  System.out.println();
	  cont++;
	}
	System.out.print(" ");
	for (int i = 0; i <= distancia; i++) {
	  System.out.print("*");
	}
	System.out.print(" ");
	s.close();
  }

}
