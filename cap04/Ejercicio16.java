package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Responde las preguntas con V para Verdadero o F para Falso");
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningun motivo aparente: ");
		String res1 = s.next();
		System.out.println("Ha aumentado sus gastos de vestuario");
		String res2 = s.next();
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
		String res3 = s.next();
		System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\n" + 
				"arregla el pelo y se asea con más frecuencia (si es mujer)");
		String res4 = s.next();
		System.out.println("No te deja que mires la agenda de su teléfono móvil");
		String res5 = s.next();
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú\n" + 
				"delante");
		String res6 = s.next();
		System.out.println("");
		

	}

}
