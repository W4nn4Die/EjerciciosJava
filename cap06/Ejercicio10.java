package com.iescampanillas.ejercicios;

public class Ejercicio10 {
  
  public static void getCar() {
	int rand = (int) (Math.random()*40 + 1);
	int randCar = (int) (Math.random()*6 + 1);
	String tempCar = "";
	switch (randCar) {
	case 1:
	  tempCar = "*";
	  break;
	case 2:
	  tempCar = "-";
	  break;
	case 3:
	  tempCar = "=";
	  break;
	case 4:
	  tempCar = ".";
	  break;
	case 5:
	  tempCar = "|";
	  break;
	case 6:
	  tempCar = "@";
	  break;
	default:
	  tempCar = "E";  
	  break;
	}
	for (int i = 1; i <= rand; i++) {
	  System.out.print(tempCar);
	}
  }

  public static void main(String[] args) {
	int cont = 0;
	while (cont < 10) {
	  getCar();
	  System.out.println();
	  cont++;
	}
	

  }

}
