package com.iescampanillas.ejercicios;

public class Ejercicio05 {

  public static void main(String[] args) {
	int rand = 0;
	int max = 0;
	int min = 200;
	int total = 0;
	for (int i = 1; i<= 50; i++) {
	  rand = (int)(Math.random()*99 + 100);
	  if (rand > max) {
		max = rand;
	  } 
	  if (rand < min) {
		min = rand;
	  }
	  total += rand;
	  System.out.println(rand);
	}
	int media = total / 50;
	System.out.printf("Maximo: %d\nMinimo: %d\n"
		+ "Media: %d", max, min, media);
  }

}
