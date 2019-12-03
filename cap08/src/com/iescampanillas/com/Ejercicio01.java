package com.iescampanillas.com;

public class Ejercicio01 {
  public static boolean esCapicua(long num) {
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
  
  public static boolean esPrimo(long num) {
	if ((num % 2) == 0) {
	  return true;
	} else {
	  return false;
	}
  }
  
  public static long siguientePrimo(long num) {
	while (!esPrimo(num++)) {
	  
	}
	return num;
  }
  
  public static double potencia(int base, int exponente) {
	if (exponente == 0) {
	  return 1;
	}

	if (exponente < 0) {
	  return 1/potencia(base, -exponente);
	}

	int n = 1;

	for (int i = 0; i < Math.abs(exponente); i++) {
	  n = n * base;
	}

	return n;
  }
  
  public static int digitos(long num) {
	int dig = 0;
	if (num < 0) {
	  num = -num;
	}
	if (num == 0) {
	  return 1;
	} else {
	  while (num > 0) {
		num /= 10;
		dig++;
	  }
	}
	return dig;
  }

  public static void main(String[] args) {

  }

}
