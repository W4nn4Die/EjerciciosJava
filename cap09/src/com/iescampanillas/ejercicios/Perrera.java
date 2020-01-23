package com.iescampanillas.ejercicios;

public class Perrera {
  public static void main(String[] args) {
	Perro perro1 = new Perro();
	Perro perro2 = new Perro();
	perro1.setNombre("Coca");
	perro2.setNombre("Caballo");
	perro1.sePelea(perro2);
  }
}
