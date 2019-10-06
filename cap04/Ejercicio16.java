package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Responde las preguntas con 0 para Verdadero o 1 para Falso");
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningun motivo aparente: ");
		int res1 = s.nextInt();
		System.out.println("Ha aumentado sus gastos de vestuario");
		int res2 = s.nextInt();
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
		int res3 = s.nextInt();
		System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\n" + 
				"arregla el pelo y se asea con más frecuencia (si es mujer)");
		int res4 = s.nextInt();
		System.out.println("No te deja que mires la agenda de su teléfono móvil");
		int res5 = s.nextInt();
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú\n" + 
				"delante");
		int res6 = s.nextInt();
		System.out.println("�ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
		int res7 = s.nextInt();
		System.out.println("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho\n" + 
				"m�s trabajo");
		int res8 = s.nextInt();
		System.out.println("Has notado que �ltimamente se perfuma m�s");
		int res9 = s.nextInt();
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		int res10 = s.nextInt();
		int contador = 0;
		if (res1 == 0) {
			contador += 3;
		}
		else if (res2 == 0) {
			contador +=  3;
		}
		else if (res3 == 0) {
			contador +=  3;
		}
		else if (res4 == 0) {
			contador += 3;
		}
		else if (res5 == 0) {
			contador += 3;
		}
		else if (res6 == 0) {
			contador += 3;
		}
		else if (res7 == 0) {
			contador += 3;
		}
		else if (res8 == 0) {
			contador += 3;
		}
		else if (res9 == 0) {
			contador += 3;
		}
		else if (res10 == 0) {
			contador += 3;
		}
		if (contador >= 0 || contador <= 10) {
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		} else if (contador >= 11 || contador <= 22) {
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		} else {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
		s.close();
	}

}
