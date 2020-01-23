package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio07_1 {

  public static void main(String[] args) {
	Ejercicio07_2 zona1 = new Ejercicio07_2(1000);
	Ejercicio07_2 zona2 = new Ejercicio07_2(200);
	Ejercicio07_2 zona3 = new Ejercicio07_2(25);
	Scanner s = new Scanner(System.in);

	boolean exit = true;
	while(exit) {
	  System.out.println("1. Mostrar numero de entradas disponibles\n2. Vender entradas\n3. Salir");
	  System.out.print("Selecciona una opcion: ");
	  int op = s.nextInt();
	  switch(op) {
	  case 1:
		System.out.println("Entradas general: " + zona1.getEntradasPorVender() + "\nEntradas pre-venta: " + zona2.getEntradasPorVender() + "\nEntradas vip: " + zona3.getEntradasPorVender());
		break;
	  case 2:
		System.out.println("1. Entrada general\n2. Entrada pre-venta\n3. Entrada vip");
		System.out.print("Selecciona una opcion: ");
		int op2 = s.nextInt();
		System.out.print("Introduce numero de entradas que desea comprar: ");
		int entradas = s.nextInt();
		switch(op2) {
		case 1:
		  zona1.vender(entradas);
		  break;
		case 2:
		  zona2.vender(entradas);
		  break;
		case 3:
		  zona3.vender(entradas);
		  break;
		default:
		  break;
		}
		break;
	  case 3:
		exit = false;
		break;
	  default:
		break;
	  }
	}
	s.close();
  }

}
