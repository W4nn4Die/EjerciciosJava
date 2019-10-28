package com.iescampanillas.ejercicios;

public class Ejercicio01 {
  
  public static void main(String[] args) {
	int rand = 0;
	int total = 0;
	for (int i = 1; i <= 3; i++) {
	  rand = (int) (Math.random()*6 + 1);
	  System.out.println("Tirada " + i + ": " + rand);
	  total += rand;
	}
	System.out.println("Total: " + total);
  }
}