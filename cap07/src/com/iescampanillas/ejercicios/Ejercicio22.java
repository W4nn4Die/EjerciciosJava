package com.iescampanillas.ejercicios;

public class Ejercicio22 {

  public static void main(String[] args) {
	int[][] arr = new int[3][6];
	arr[0][0] = 0;
	arr[1][0] = 75;
	arr[0][1] = 30;
	arr[0][2] = 2;
	arr[2][2] = -2;
	arr[2][3] = 9;
	arr[1][4] = 0;
	arr[0][5] = 5;
	arr[2][5] = 11;
	for (int x = 0; x<3; x++) {
	  for (int j=0; j<6; j++) {
		System.out.printf("%-6d", arr[x][j]);
	  }
	  System.out.println("");
	}

  }

}
