package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int secret = (int) (Math.random()*101);
	int intentos = 5;
	while (intentos >= 0) {
	  System.out.println("Tienes " + intentos + " intentos");
	  System.out.print("Introduce un numero entre 0 y 100: ");
	  int guess = s.nextInt();
	  if (guess != secret) {
		System.out.println("Fallo");
		if (guess > secret) {
		  System.out.println("El numero es mas chico");
		} else {
		  System.out.println("El numero es mas grande");
		}
	  } else if (guess == secret) {
		System.out.print("Has acertado");
		intentos = 0;
	  }
	  intentos--;
	}
	System.out.println("El numero era: " + secret);
	s.close();
  }

}
