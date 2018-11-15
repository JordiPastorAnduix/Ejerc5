import java.util.Scanner;

public class Practica24 {

	public static void main(String[] args) {

		String palabras1 = " ";
		String palabras2 = " ";
		String[] array1 = null;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Pon tu primera cadena: ");
		palabras1 = teclado.nextLine();

		array1 = palabras1.split(" ");

		System.out.println("Pon tu segunda cadena: ");
		palabras2 = teclado.nextLine();

		for (int i = 0; i < array1.length; i++) {
			if (array1[i].compareTo(palabras2) == 0) {
				System.out.print(array1[i].toUpperCase() + " ");
			} else {
				System.out.print(array1[i] + " ");
			}

		}
		teclado.close();
	}

}
