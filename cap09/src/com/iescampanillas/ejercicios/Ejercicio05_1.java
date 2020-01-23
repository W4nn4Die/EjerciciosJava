package com.iescampanillas.ejercicios;

public class Ejercicio05_1 {

  public static void main(String[] args) {
	Ejercicio05_2 pizza1 = new Ejercicio05_2("margarita", "mediana");
	Ejercicio05_2 pizza2 = new Ejercicio05_2("funghi", "familiar");
	Ejercicio05_2 pizza3 = new Ejercicio05_2("", "mediana");
	
	pizza2.sirve();
	System.out.println(pizza2);
	System.out.println(pizza1);
	System.out.println(pizza3);
	System.out.println("Pedidas: " + Ejercicio05_2.getTotalPedidas());
	System.out.println("Pedidas: " + Ejercicio05_2.getTotalServidas());
  }

}
