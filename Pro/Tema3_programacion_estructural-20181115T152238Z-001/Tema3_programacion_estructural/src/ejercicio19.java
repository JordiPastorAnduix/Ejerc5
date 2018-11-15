import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		int num = 0;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el intervalo: ");
		while (!teclado.hasNextInt()) {
			System.out.println("No es un numero entero: ");
			teclado.next();
		}
		num = teclado.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0) {
				suma = suma + i;

			}
		}

		System.out.println("La suma es: " + suma);

		teclado.close();

	}

}