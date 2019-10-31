package com.iescampanillas.ejercicios;

public class Ejercicio08 {

  public static void main(String[] args) {
	int valor = 0;
	String strValor = "";
	int cont = 1;
	while (cont <= 14) {
	  for (int x = 1; x<= 3; x++) {
		valor = (int) (Math.random()*6 + 1);
		  if (valor >= 1 && valor <= 3) {
			strValor += "|1  ";
		  } else if (valor >= 4 && valor <= 5) {
			strValor += "| X ";
		  } else if (valor == 6){
			strValor += "|  2";
		  }
	  }
	  System.out.printf("%-3d%s|\n", cont, strValor);
	  strValor = "";
	  cont++;
	}

  }

}
