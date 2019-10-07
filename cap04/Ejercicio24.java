package com.iescampanillas.ejercicios;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. Programador Junior");
		System.out.println("2. Programador Senior");
		System.out.println("3. Jefe de proyecto");
		System.out.print("Introduzca el cargo del empleado (1-3): ");
		int cargo = s.nextInt();
		System.out.print("¿Cuantos dias ha estado de viaje visitando clientes?: ");
		int diasViaje = s.nextInt();
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		int estadoCivil = s.nextInt();
		float sueldoBase = 0;
		switch(cargo) {
		case 1:
			sueldoBase = 950;
			break;
		case 2:
			sueldoBase = 1200;
			break;
		case 3:
			sueldoBase = 1600;
			break;
		}
		float dietas = diasViaje * 30;
		float sueldoBruto = dietas + sueldoBase;
		double irpf = 0;
		String valorIrpf = "";
		switch(estadoCivil) {
		case 1:
			irpf = sueldoBruto * 0.25;
			valorIrpf = "25%";
			break;
		case 2:
			irpf = sueldoBruto * 0.20;
			valorIrpf = "20%";
			break;
		}
		float sueldoNeto = (float) (sueldoBruto - irpf);
		System.out.printf("Sueldo base\t\t%.2f\n", sueldoBase);
		System.out.printf("Dietas (%d viajes)\t%.2f\n", diasViaje, dietas);
		System.out.printf("Sueldo bruto\t\t%.2f\n", sueldoBruto);
		System.out.printf("IRPF (%s)\t\t%.2f\n", valorIrpf, irpf);
		System.out.printf("Sueldo neto\t\t%.2f", sueldoNeto);
		s.close();

	}

}
