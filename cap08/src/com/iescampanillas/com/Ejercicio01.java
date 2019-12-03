package com.iescampanillas.com;

public class Ejercicio01 {
  public static boolean esCapicua(long num) {
	if (voltea(num) == num) {
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
  
  public static long voltea(long num) {
	long numero = num;
	long volt = 0;
	while (numero > 0) {
	  volt = (volt * 10) + (numero % 10);
	  numero /= 10;
	}
	return volt;
  }
  
  public static int digitoN(long num, int pos) {
	String s = Long.toString(num);
	if (pos == 0) {
	  int result = Integer.parseInt(s.substring(0,0));
	  return result;
	} else {
	  int result = Integer.parseInt(s.substring(pos--,pos));
	  return result;
	}
  }
  
  public static int posicionDeDigito(long num, int ocu) {
	int i;

    for (i = 0; (i < digitos(num)) && (digitoN(num, i) != ocu); i++) {};

    if (i == digitos(num)) {
      return -1;
    } else {
      return i;
    }
  }
  
  public static long quitaPorDetras(long num, long dig) {
	return num / (long)potencia(10, (int) dig);
  }
  
  public static long quitaPorDelante(long num, int dig) {
	num = pegaPorDetras(num, 1);
    num = voltea(quitaPorDetras(voltea(num), dig));
    num = quitaPorDetras(num, 1);
    return num;
  }
  
  public static long pegaPorDetras(long num, int dig) {
	return juntaNumeros(num, dig);
  }
  
  public static long pegaPorDelante(long num, int dig) {
	return juntaNumeros(dig, num);
  }
  
  public static long trozoDeNumero(long num, int inicio, int fin) {
	int longitud = digitos(num);
    num = quitaPorDelante(num, inicio);
    num = quitaPorDetras(num, longitud - fin - 1);
    return num;
  }
  
  public static long juntaNumeros(long num1, long num2) {
	num1 = pegaPorDetras(num1, 1);
    num1 = voltea(quitaPorDetras(voltea(num1), num2));
    num1 = quitaPorDetras(num1, 1);
    return num1;
  }

  public static void main(String[] args) {

  }

}
