import java.util.Scanner;

public class Practica1 {

	private int[] listaEnteros = new int[10];

	public static void main(String[] args) {
		Practica1 programa = new Practica1();
		programa.inicio();
	}
	
	public void inicio() {
		leerLista();
		ordenarLista();
		mostrarLista();
	}

	public void leerLista() {
		int aux = 0;
		int valor = 0;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < listaEnteros.length; i++) {
			System.out.println("Introduceme los 10 numeros que quieres que ordene. Numero " + valor + ":");
			while(!teclado.hasNextInt()) {
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
		for (int i = 0; i < listaEnteros.length; i++) {
			System.out.print(listaEnteros[i] + " ");
		}
	}
}
