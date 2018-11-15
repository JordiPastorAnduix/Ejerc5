import java.util.Scanner;

public class ejercicio15 {

	static final int kNUMEROSECRE = 241;

	public static void main(String[] args) {
		
		int numero = 0;
		boolean fallos = false;
		int intentos = 2;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduceme el numero sectreto: ");
		while (!teclado.hasNextInt()) {
			System.out.println("Que sea un numero entero: ");
			teclado.next();
		}
		numero = teclado.nextInt();
		while (fallos == false) {
			if (numero != kNUMEROSECRE) {
				System.out.println("Incorrecto, prueba otra vez:");
				numero = teclado.nextInt();
				intentos--;
			}

			if (intentos == 0) {
				fallos = true;
				System.out.println("Te has quedado sin intentos");
			}
			if (numero == kNUMEROSECRE) {
				fallos = true;
			}
		}
		if (numero == kNUMEROSECRE)
			System.out.println("Correcto");

		teclado.close();
	}
}
