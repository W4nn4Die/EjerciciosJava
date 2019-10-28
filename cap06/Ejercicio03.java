package com.iescampanillas.ejercicios;

public class Ejercicio03 {

  public static void main(String[] args) {
	int palo = (int) (Math.random()*4 + 1);
	String paloStr = "";
	switch (palo) {
	case 1:
	  paloStr = "picas";
	  break;
	case 2:
	  paloStr = "corazones";
	  break;
	case 3:
	  paloStr = "diamantes";
	  break;
	case 4:
	  paloStr = "treboles";
	  break;
	  default:
		paloStr = String.valueOf(palo);
	}
	int carta = (int) (Math.random()*10 + 1);
	String cartaStr = "";
	switch (carta) {
	case 1:
	  cartaStr = "as";
	  break;
	case 8:
	  cartaStr = "sota";
	  break;
	case 9:
	  cartaStr = "caballo";
	  break;
	case 10:
	  cartaStr = "rey";
	  break;
	  default:
		cartaStr = String.valueOf(carta);
	}
	System.out.println(cartaStr + " de " + paloStr);

  }

}
