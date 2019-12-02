package com.iescampanillas.ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] num = new int[100];
	for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
      System.out.print(num[i] + " ");
    }
	System.out.print("Introduce un numero: ");
	int num1 = s.nextInt();
	System.out.print("Introduce otro numero: ");
	int num2 = s.nextInt();
	for (int i: num) {
	  if (i == num1) {
		System.out.printf("\"%d\"" + " ", num2);
	  } else {
		System.out.print(i + " ");
	  }
	}
	s.close();
  }

}
