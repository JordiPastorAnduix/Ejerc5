
import java.util.Scanner;

public class Practica15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arraybidimensional;
		int numerofilas = 0;
		int numerocolumnas = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime el numero de filas que tendra el array: ");
		while (!teclado.hasNextInt()) {
			System.out.println("Solo funciona con numeros entero: ");
			teclado.next();
		}
		numerofilas = teclado.nextInt();

		System.out.print("Dime el numero de columnas que tendra el array: ");
		while (!teclado.hasNextInt()) {
			System.out.println("Solo funciona con numeros enteros: ");
			teclado.next();
		}
		numerocolumnas = teclado.nextInt();

		arraybidimensional = new int[numerofilas][numerocolumnas];

		for (int i = 0; i < arraybidimensional.length; i++) {
			for (int j = 0; j < arraybidimensional[i].length; j++) {
				arraybidimensional[i][j] = i + j;
				System.out.print(arraybidimensional[i][j]+" ");

			}
			System.out.println();

		}

		teclado.close();
	}

}
