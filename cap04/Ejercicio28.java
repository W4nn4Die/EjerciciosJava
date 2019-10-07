package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
		String p1 = s.next().toLowerCase();
		System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
		String p2 = s.next().toLowerCase();
		if (p1.equals(p2)) {
			System.out.println("Empate");
		} else if (p1.equals("piedra") && p2.equals("papel")) {
			System.out.print("Jugador 2 gana");
		} else if (p1.equals("papel") && p2.equals("tijeras")) {
			System.out.print("Jugador 2 gana");
		} else if (p1.equals("tijeras") && p2.equals("piedra")){
			System.out.print("Jugador 2 gana");
		} else {
			System.out.print("Jugador 1 gana");
		}
		s.close();
	}

}
