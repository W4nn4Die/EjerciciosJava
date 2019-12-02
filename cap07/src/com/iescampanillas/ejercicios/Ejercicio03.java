package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int cont = 0;
	int num = 0;
	int[] arr = new int[10];
	while (cont < 10) {
	  System.out.print("Introduce un número: ");
	  num = s.nextInt();
	  arr[cont] = num;
	  cont++;
	}
	for (int i=9; i>= 0; i--) {
	  System.out.print(arr[i] + " ");
	}
	s.close();
  }

}
