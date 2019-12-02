package com.iescampanillas.com;

public class Ejercicio01 {
  boolean esCapicua(long num) {
	long numero = num;
	long volt = 0;
	while (numero > 0) {
	  volt = (volt * 10) + (numero % 10);
	  numero /= 10;
	}
	if (volt == num) {
	  return true;
	} else {
	  return false; 
	}
  }
  
  boolean esPrimo(long num) {
	if ((num % 2) == 0) {
	  return true;
	} else {
	  return false;
	}
  }

  public static void main(String[] args) {

  }

}
