package com.iescampanillas.ejercicios;

public class Gato {
  
  String nombre;
  String color;
  String sexo;
  int edad;
  double peso;
  
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  void maulla() {
    System.out.println("Miauuuu");
  }
  
  void ronronea() {
    System.out.println("prrrr");
  }

}
