package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int sum = 0;
	  while (sum <= 1000) {
		System.out.print("Introduce un numero para sumar hasta llegar a 1000: ");
		int num = s.nextInt();
		sum += num;
		System.out.println("Total: " + sum);
	  }
	  System.out.println("Has pasado 1000");
	  s.close();
	}

}
