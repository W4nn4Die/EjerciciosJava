package com.iescampanillas.ejercicios;

public class Ejercicio07_2 {
  private int entradasPorVender;

  public Ejercicio07_2(int n) {
	entradasPorVender = n;
  }

  public int getEntradasPorVender() {
	return entradasPorVender;
  }

  public void setEntradasPorVender(int entradasPorVender) {
	this.entradasPorVender = entradasPorVender;
  }

  public void vender(int n) {
	if (getEntradasPorVender() == 0) {
	  System.out.println("No quedan entradas en esta zona");
	} else if (getEntradasPorVender() < n) {
	  System.out.println("Solo quedan " + getEntradasPorVender() + " entradas en esta zona");
	} 
	
	if (getEntradasPorVender() >= n) {
	  setEntradasPorVender(getEntradasPorVender()-n);
	  System.out.println("Aquí tiene sus " + n + " entradas");
	}
  }
}
