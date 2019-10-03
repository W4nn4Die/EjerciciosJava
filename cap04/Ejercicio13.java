package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce 3 numeros: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		if (num1 <= num2 && num1 <= num3) {
			if (num2 <= num3) {
				System.out.printf("%d %d %d", num3, num2, num1);
			} else {
				System.out.printf("%d %d %d", num2, num3, num1);
			}
		} else if (num1 >= num2 && num1 >= num3) {
			if (num2 <= num3) {
				System.out.printf("%d %d %d", num1, num3, num2);
			} else {
				System.out.printf("%d %d %d", num1, num2, num3);
			}
		} else if (num2 <= num1 && num2 <= num3) {
			if (num1 <= num3) {
				System.out.printf("%d %d %d", num3, num1, num2);
			} else {
				System.out.printf("%d %d %d", num1, num3, num2);
			}
		} 
		s.close();

	}

}
