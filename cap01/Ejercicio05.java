package com.iescampanillas.ejercicios;

public class Ejercicio05 {
	static String Reset = "\033[0m";
	static String Days = "\033[31m";
	static String Pro = "\033[35mPRO";
	static String Bbdd = "\033[91mBBDD";
	static String Edd = "\033[92mEDD";
	static String Lm = "\033[94mLM";
	static String Sinf = "\033[95mSINF";
	static String Fol = "\033[96mFOL";
	public static void main(String[] args) {
		System.out.printf(Days + "%-10s %-10s %-10s %-10s %-15s\n" + Reset, "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" + Reset, Pro, Edd, Pro, Pro, Sinf);
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" + Reset, Pro, Lm, Pro, Pro, Sinf);
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" + Reset, Pro, Lm, Pro, Edd, Sinf);
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" + Reset, Bbdd, Sinf, Bbdd, Lm, Fol);
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" + Reset, Bbdd, Sinf, Bbdd, Lm, Fol);
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" + Reset, Bbdd, Sinf, Bbdd, Lm, Fol);
	}

}
