import java.util.Scanner;

public class Practica14 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Practica14 programa = new Practica14();

		int[] array1 = new int[8];
		int valor = 0;
		programa.rellenarArray(array1);
		valor=programa.pedirNumero();
		System.out.println(programa.buscarNumero(array1, valor));
		programa.cerrar();

	}
	
	public void rellenarArray(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Dame el valor " + i + " para rellenar la array: ");
			while (!teclado.hasNextInt()) {
				System.out.print("Tiene que ser un entero: ");
				teclado.next();
			}
			array1[i] = teclado.nextInt();

		}
	
	}

	public int pedirNumero() {
		int valor = 0;
		System.out.print("Dame el valor que quieres buscar: ");
		while (!teclado.hasNextInt()) {
			System.out.print("Tiene que ser un entero: ");
			teclado.next();
		}
		valor = teclado.nextInt();
		return valor;
	}

	public int buscarNumero(int[] array1, int valor) {
		int contador = 0;
		for (int i = 0; i < array1.length; i++) {
			if (valor == array1[i]) {
				contador++;
			}
		}
		System.out.print("El numero " + valor + " esta repetido ");
		return contador;
	}

	public void cerrar() {
		teclado.close();
	}



}
