import java.util.Scanner;

public class Practica9 {

	public static void main(String[] args) {
		
		int cantidad = 0;
		int[] notas;
		int nota = 0;
		float media = 0F;
		int suma = 0;
		int numMayor = 0;

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

		for (int i = 0; i < cantidad && nota != -1; i++) {
			System.out.println("Introduce nota: ");
			while (!teclado.hasNextInt()) {
				System.out.print("Vuelve a introducir cantidad de notas: ");
				teclado.next();
			}
			nota = teclado.nextInt();
			while (nota < -1 || nota > 10) {
				System.out.print("Vuelve a introducir nota: ");
				nota = teclado.nextInt();
			}
			if (numMayor < nota) {
				numMayor = nota;
			}
			if (nota != -1) {
				notas[i] = nota;
			}
		}
		
		for(int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		
		media = (float)suma / cantidad;
		System.out.println("La media de las notas es " + media);
		System.out.println("El numero mas grande es " + numMayor);

		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		teclado.close();

	}

}