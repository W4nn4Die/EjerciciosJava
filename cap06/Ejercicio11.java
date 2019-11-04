package com.iescampanillas.ejercicios;

public class Ejercicio11 {

  public static void main(String[] args) {
	int totalSuspenso = 0;
	int totalSuficiente = 0;
	int totalBien = 0;
	int totalNotable = 0;
	int totalSobresaliente = 0;
	int nota = 0;
	String strNota = "";
	for (int i = 1; i<=20; i++) {
	  nota = (int) (Math.random() * 10);
	  switch(nota) {
	  case 0:
	  case 1:
	  case 2:
	  case 3:
	  case 4:
		totalSuspenso++;
		strNota = "Suspenso";
		break;
	  case 5:
		totalSuficiente++;
		strNota = "Suficiente";
		break;
	  case 6:
		totalBien++;
		strNota = "Bien";
		break;
	  case 7:
	  case 8:
		totalNotable++;
		strNota = "Notable";
		break;
	  case 9:
	  case 10:
		totalSobresaliente++;
		strNota = "Sobresaliente";
		break;
	  }
	  System.out.printf("Nota %d: %s\n", i, strNota);
	}
	System.out.println("Total suspensos: " + totalSuspenso);
	System.out.println("Total suficientes: " + totalSuficiente);
	System.out.println("Total bien: " + totalBien);
	System.out.println("Total notables: " + totalNotable);
	System.out.println("Total sobresalientes: " + totalSobresaliente);
  }
}
