import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce numero entero");
			while (!sc.hasNextInt()) {
				System.out.println("No es un numero entero: ");
				sc.next();
			}
			numero = sc.nextInt();
		} while (numero < 0 || numero > 10);

		System.out.println("Has acertado");
		sc.close();

	}

}
