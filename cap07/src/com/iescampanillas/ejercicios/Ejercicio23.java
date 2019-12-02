package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[][] arr = new int[4][5];
	int x = 0;
	int y = 0;
	for (x = 0; x<4; x++) {
	  for (y = 0; y<5; y++) {
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		arr[x][y] = num;
	  }
	}
	for (x = 0; x<4; x++) {
	  for (y = 0; y<5; y++) {
		System.out.printf("%-6d", arr[x][y]);
	  }
	  System.out.println(" ");
	}
	s.close();

  }

}
