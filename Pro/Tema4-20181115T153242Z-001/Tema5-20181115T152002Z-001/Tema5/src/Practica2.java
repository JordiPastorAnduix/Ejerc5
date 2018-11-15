import java.util.Scanner;

public class Practica2 {

	private int[] listaEnteros = new int[10];
	private int numeroMitad = 0;
	private int contador = 0;

	public static void main(String[] args) {
		Practica2 programa = new Practica2();
		programa.inicio();
	}

	public void inicio() {
		leerLista();
		ordenarLista();
		mostrarLista();
		imprimirMax();
		laMitad();
		comparacion();
		contador();
	}

	public void leerLista() {
		int aux = 0;
		int valor = 1;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < listaEnteros.length; i++) {
			System.out.println("Introduceme los 10 numeros que quieres que ordene. Numero " + valor + ":");
			while (!teclado.hasNextInt()) {
				System.out.println("Tiene que ser un entero");
				teclado.next();
			}
			aux = teclado.nextInt();
			listaEnteros[i] = aux;
			valor++;
		}
		teclado.close();
	}

	public void ordenarLista() {
		int cambia = 0;
		for (int i = 0; i < listaEnteros.length - 1; i++) {
			for (int j = i + 1; j < listaEnteros.length; j++) {
				if (listaEnteros[i] > listaEnteros[j]) {
					cambia = listaEnteros[i];
					listaEnteros[i] = listaEnteros[j];
					listaEnteros[j] = cambia;
				}
			}
		}
	}

	public void mostrarLista() {
		System.out.println("Aqui tienes los numeros ordenados: ");
		for (int i = 0; i < listaEnteros.length; i++) {
			System.out.print(listaEnteros[i] + " ");
		}
	}

	public void imprimirMax() {
		System.out.println(" ");
		System.out.print("Este el numero mas grande: ");
		System.out.print(listaEnteros[listaEnteros.length - 1]);
	}

	public void laMitad() {
		numeroMitad = listaEnteros[listaEnteros.length - 1] / 2;
	}

	public void comparacion() {
		System.out.println(" ");
		for (int i = 0; i < listaEnteros.length; i++) {
			if (listaEnteros[i] < numeroMitad) {
				contador++;
			}
		}
	}

	public void contador() {
		System.out.print("Hay " + contador + " numeros menores que la mitad del mas grande.");
	}
}
