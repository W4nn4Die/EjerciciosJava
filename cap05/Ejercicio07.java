package com.iescampanillas.ejercicios;
import java.util.Scanner;
import javax.naming.SizeLimitExceededException;

public class Ejercicio07 {

	public static void main(String[] args) throws SizeLimitExceededException {
		Scanner s = new Scanner(System.in);
		int i = 4;
		while (i>=1) {
			System.out.printf("Tienes %d intento/s\n", i);
			System.out.print("Introduce el codigo: ");
			int code = s.nextInt();
			int goodCode = 3423;
			int longitud = String.valueOf(code).length();
			if (longitud > 4) {
				s.close();
				throw new SizeLimitExceededException("\nEl codigo no puede tener mas de 4 digitos");
			}
			if (code != goodCode) {
				System.out.println("Lo siento, esa no es la combinación");
				i -= 1;
			} else {
				s.close();
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				i = 0;
			}
		} 
		s.close();
	}

}
