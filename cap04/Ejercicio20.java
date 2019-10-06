package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero con no mas de 5 digitos: ");
		int num = s.nextInt();
		int digitsNum = String.valueOf(num).length();
		if (digitsNum > 5) {
			System.out.println("No puedes introducir un numero con mas de 5 digitos");
			System.exit(0);
		}
		int rest = num;
		int inverso = 0;
		while (rest != 0) {
			int digito = rest % 10;
			inverso = inverso * 10 + digito;
			rest = rest / 10;			
		}
		if (num == inverso) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
		s.close();

	}

}
