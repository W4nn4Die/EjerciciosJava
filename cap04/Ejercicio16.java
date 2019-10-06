package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Responde las preguntas con 'verdadero' para Verdadero o 'falso' para Falso");
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningun motivo aparente: ");
		String res1 = s.nextLine();
		System.out.println("Ha aumentado sus gastos de vestuario");
		String res2 = s.nextLine();
		System.out.println("Ha perdido el Stringerés que mostraba anteriormente por ti");
		String res3 = s.nextLine();
		System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		String res4 = s.nextLine();
		System.out.println("No te deja que mires la agenda de su teléfono móvil");
		String res5 = s.nextLine();
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		String res6 = s.nextLine();
		System.out.println("�ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
		String res7 = s.nextLine();
		System.out.println("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo");
		String res8 = s.nextLine();
		System.out.println("Has notado que �ltimamente se perfuma m�s");
		String res9 = s.nextLine();
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		String res10 = s.nextLine();
		int contador = 0;
		if (res1.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res2.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res3.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res4.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res5.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res6.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res7.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res8.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res9.equals("verdadero")) {
			contador = contador + 3;
		}
		if (res10.equals("verdadero")) {
			contador = contador + 3;
		}
		if (contador >= 0 && contador <= 10) {
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel." + contador);
		} 
		else if (contador >= 11 && contador <= 22) {
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		} else {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
		s.close();
	}

}
