package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] num = new int[15];
	int restantes = 0;
	while (restantes <= 14) {
	  System.out.print("Introduce un numero: ");
	  num[restantes] = s.nextInt();
	  restantes++;
	}
	System.out.print("Old array: ");
	for (int i: num) {
	  System.out.print(i + " ");
	}
	restantes = 14;
	int temp = num[14];
	for (int i = (restantes - 1); i>= 0; i--) {
	  num[i+1] = num[i];
	}
	num[0] = temp;
	System.out.println("");
	System.out.print("New array: ");
	for (int i: num) {
	  System.out.print(i + " ");
	}
	s.close();
  }

}
