import java.util.Scanner;

public class EjercicioRepaso3 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		EjercicioRepaso3 programa = new EjercicioRepaso3();
		int[] array1 = new int[programa.dimensionar()];
		int[] array2 = new int[array1.length];
		int[] array3 = new int[array1.length];
		programa.rellenar1(array1);
		programa.rellenar2(array2);
		programa.multiplicacion(array1, array2, array3);
		programa.imprimirArrays(array3, array2, array1);
		programa.cerrar();
	}

	public int dimensionar() {
		int dimension = 0;
		System.out.println("Como de grande quieres que sean los arrays?");
		while (!teclado.hasNextInt()) {
			System.out.println("Tiene que ser un entero: ");
			teclado.next();
		}
		dimension = teclado.nextInt();
		return dimension;
	}

	public void rellenar1(int[] array1) {
		int aux = 1;
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Dame el valor " + aux + " del primer array:");
			while (!teclado.hasNextInt()) {
				System.out.print("Tiene que ser un entero: ");
				teclado.next();
			}
			array1[i] = teclado.nextInt();
			aux++;
		}
	}

	public void rellenar2(int[] array2) {
		int aux = 1;
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Dame el valor " + aux + " del segundo array:");
			while (!teclado.hasNextInt()) {
				System.out.print("Tiene que ser un entero: ");
				teclado.next();
			}
			array2[i] = teclado.nextInt();
			aux++;
		}
	}

	public void multiplicacion(int[] array1, int[] array2, int[] array3) {
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
	}

	public void imprimirArrays(int[] array3, int[] array2, int[] array1) {
		System.out.println("Tus arrays son: ");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println("\nLos resultados de las multiplicaciones son: ");
		for (int i = 0; i < array3.length; i++)
			System.out.print(array3[i] + " ");
	}

	public void cerrar() {
		teclado.close();
	}
}
