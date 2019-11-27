package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int restantes = 0;
	int[] num = new int[10];
	while (restantes <= 9) {
	  System.out.print("Introduce un numero: ");
	  num[restantes] = s.nextInt();
	  restantes++;
	}	
	int max = 0;
	for (int i: num) {
	  if (i > max) {
		max = i;
	  } 
	}
	int min = max;
	for (int i: num) {
	  if (i < min) {
		min = i;
	  }
	}
	for (int i: num) {
	  if (i == max) {
		System.out.printf("%d maximo\n", i);
	  } else if (i == min) {
		System.out.printf("%d minimo\n", i);
	  } else {
		System.out.printf("%d\n", i);
	  }
	}
	s.close();

  }

}
