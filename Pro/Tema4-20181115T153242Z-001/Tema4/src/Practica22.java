
import java.util.Scanner;

public class Practica22 {

	public static void main(String[] args) {

		String valor = "";
		String[] arrayPalabras = new String[5];
		String aux = "";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Pon los valores del vector");
		for (int i = 0; i < arrayPalabras.length; i++) {
			System.out.println("Introduceme " + i);
			valor = teclado.nextLine();
			arrayPalabras[i] = valor;
		}

		System.out.println("Array original:");
		for (int j = 0; j < arrayPalabras.length; j++) {
			System.out.print(arrayPalabras[j] + " ");
		}
		for (int i = 0; i < (arrayPalabras.length - 1); i++) {
			for (int j = i + 1; j < arrayPalabras.length; j++) {
				if (arrayPalabras[i].compareTo(arrayPalabras[j]) > 0) {
					aux = arrayPalabras[i];
					arrayPalabras[i] = arrayPalabras[j];
					arrayPalabras[j] = aux;

				}
			}
		}

		System.out.println("\nArray ordenado:");
		for (int j = 0; j < arrayPalabras.length; j++) {
			System.out.print(arrayPalabras[j] + " ");
		}

		teclado.close();
	}

}
