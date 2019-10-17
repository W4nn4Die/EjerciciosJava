import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	boolean flag = true;
	int altInicial = 0;
	while (flag) {
	  System.out.print("Introduzca la altura inicial: ");
	  altInicial = s.nextInt();
	  if ((altInicial%2) == 0 || altInicial < 3) {
		System.out.print("No es valido; debe ser impar y mayor o igual a 3. Introduzca la altura inicial: ");
	  } else {
		flag = false;
	  }
	}
	System.out.print("Introduzca el caracater para dibujar: ");
	String relleno = s.next();
	System.out.print("Introduzca el numero de veces que desea dibujar el reloj: ");
	int veces = s.nextInt();
	int cont = 0;
	int espacio = 0;
	int longi = (altInicial * 2) - 1;
	int base = 1;
	while (cont < veces) {
	  while (base < altInicial) {
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
	  for (int i = 0; i < espacio; i++) {
		System.out.print(" ");
	  }
	  System.out.print(relleno);
	  espacio = altInicial - 1;
	  longi = 2;
	  base = 1;
	  System.out.println();
	  while (base < altInicial) {
		for (int i = 2; i <= espacio; i++) {
			System.out.print(" ");
		  }
		for (int i = 0; i <= longi; i++) {
		  System.out.print(relleno);
		}
		System.out.println();
		espacio--;
		longi += 2;
		base++;
	  }
	  System.out.println();
	  base = 1;
	  espacio = 0;
	  longi = (altInicial * 2) - 1;
	  cont++;
	}
	s.close();
  }

}
