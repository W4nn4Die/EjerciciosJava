import java.util.Scanner;

public class Ejercicio04 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca la altura inicial: ");
	int altInicial = s.nextInt();
	System.out.print("Introduzca el caracter para dibujar: ");
	String relleno = s.next();
	System.out.print("Introduzca el incremento en la altura: ");
	int incremento = s.nextInt();
	System.out.print("Introduzca el numero de veces que desea dibujar"
		+ "la piramide: ");
	int numPiramide = s.nextInt();
	int cont = 0;
	int base = 1;
	int espacio = 0;
	int longi = (altInicial*2) -1;
	while (cont < numPiramide) {
	  while (base <= altInicial) {
		for (int i = 0; i < espacio; i++) {
		  System.out.print(" ");
		}
		
		for (int i = longi; i > 0; i--) {
		  System.out.print(relleno);
		}
		System.out.println();
		espacio++;
		longi -= 2;
		base++;
	  }
	  System.out.println();
	  altInicial += incremento;
	  base = 1;
	  espacio = 0;
	  longi = (altInicial * 2) - 1;
	  cont++;
	}
	s.close();
  }

}
