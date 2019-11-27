package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] num = new int[15];
	//int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	int[] copy = num;
	int restantes = 0;
	while (restantes <= 14) {
	  System.out.print("Introduce un numero: ");
	  num[restantes] = s.nextInt();
	  restantes++;
	}
	for (int i: num) {
	  System.out.print(i + " ");
	}
	restantes = 14;
	//num[0] = copy[14];
	//num[0] = copy[14];
	int temp = num[14];
	for (int i = (restantes - 1); i>= 0; i--) {
	  num[i+1] = num[i];
	}
	num[0] = temp;
	System.out.println("");
	for (int i: num) {
	  System.out.print(i + " ");
	}
	s.close();
  }

}
