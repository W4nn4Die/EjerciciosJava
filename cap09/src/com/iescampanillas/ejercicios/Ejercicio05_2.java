package com.iescampanillas.ejercicios;

public class Ejercicio05_2 {
  String tamanno;
  String estado;
  String tipo;
  static int pizzasTotales = 0;
  static int pizzasServidas = 0;
  
  public Ejercicio05_2(String tipo, String tamanno) {
	this.tamanno = tamanno;
	this.tipo = tipo;
	this.estado = "pedida";
	pizzasTotales++;
  }
  
  public String toString() {
	return "pizza " + this.tipo + " " + this.tamanno + ", " + this.estado;
  }
  
  public String getTamanno() {
    return tamanno;
  }
  public void setTamanno(String tamanno) {
    this.tamanno = tamanno;
  }
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  public void sirve() {
	this.estado = "servida";
	pizzasServidas++;
  }
  
  public static int getTotalServidas() {
	return Ejercicio05_2.pizzasServidas;
  }
  
  public static int getTotalPedidas() {
	return Ejercicio05_2.pizzasTotales;
  }
  
}
