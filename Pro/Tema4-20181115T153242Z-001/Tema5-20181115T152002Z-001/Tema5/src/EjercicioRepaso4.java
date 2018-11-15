import java.util.Scanner;

public class EjercicioRepaso4 {
	static Scanner teclado = new Scanner(System.in);
	static final String kDIBUJO= "*";

	public static void main(String[] args) {
		EjercicioRepaso4 programa = new EjercicioRepaso4();
		int[] array1 = new int[programa.dimensionar()];
		programa.rellenar(array1);
		programa.carcateres(array1);
		programa.cerrar();

	}

	public int dimensionar() {
		int dimension = 0;
		System.out.println("Como de grande quieres que sea el array?");
		while (!teclado.hasNextInt()) {
			System.out.println("Tiene que ser un entero: ");
			teclado.next();
		}
		dimension = teclado.nextInt();
		return dimension;
	}

	public void rellenar(int[] array1) {
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
	
	public void carcateres(int [] array1) {
		System.out.println("Voy a imprimir tu dibujo");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i]; j++) {
				System.out.print(kDIBUJO);
			}
			System.out.println("");
		}
	}
	
	public void cerrar() {
		teclado.close();
	}
	
}
