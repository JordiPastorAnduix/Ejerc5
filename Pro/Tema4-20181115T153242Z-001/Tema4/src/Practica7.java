import java.util.Scanner;

public class Practica7 {

	public static void main(String[] args) {
		// int[] vector1 = new int[kNUM_VALORES];
		int cantidad = 0;
		int[] notas;
		int nota = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe cantidad de notas: ");

		while (!teclado.hasNextInt()) {
			System.out.print("Vuelve a introducir cantidad de notas: ");
			teclado.next();
		}

		cantidad = teclado.nextInt();

		while (cantidad < 1) {
			System.out.print("Vuelve a introducir cantidad de notas: ");
			cantidad = teclado.nextInt();
		}

		notas = new int[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce nota: ");
			while (!teclado.hasNextInt()) {
				System.out.print("Vuelve a introducir cantidad de notas: ");
				teclado.next();
			}
			nota = teclado.nextInt();
			while (nota < 0 || nota > 10) {
				System.out.print("Vuelve a introducir nota: ");
				nota = teclado.nextInt();
			}
			notas[i] = nota;
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		teclado.close();

	}

}
