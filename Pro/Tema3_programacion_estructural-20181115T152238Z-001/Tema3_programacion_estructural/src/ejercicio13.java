import java.util.Scanner;

public class ejercicio13 {

	static final int kNUMEROSECRE = 241;

	public static void main(String[] args) {

		int numero = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Adivina el numero: ");
		while (!teclado.hasNextInt()) {
			System.out.println("No es un numero entero: ");
			teclado.next();
		}
		numero = teclado.nextInt();
		while (numero != kNUMEROSECRE) {
			System.out.println("Prueba otra vez: ");
			numero = teclado.nextInt();
		}
		System.out.println("Has acertado el numero");
		teclado.close();
	}
}
