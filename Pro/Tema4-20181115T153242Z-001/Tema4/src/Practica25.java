
import java.util.Scanner;

public class Practica25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroArray = 0;
		int[] primerArray = null;
		int[] segundoArray = null;
		int aux = 0;
		int numeroBuscar = 0;
		int n = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce largaria de array: ");

		numeroArray = teclado.nextInt();

		primerArray = new int[numeroArray];

		System.out.print("Ahora voy a rellenar el array con numero aleatorios entre 1 y 300: ");
		System.out.println("");

		for (int i = 0; i < primerArray.length; i++) {
			primerArray[i] = (int) (Math.random() * 300) + 1;
			System.out.print(primerArray[i] + " ");
		}

		System.out.println("");
		System.out.print("Que numero quieres buscar: ");

		numeroBuscar = teclado.nextInt();

		for (int j = 0; j < primerArray.length; j++) {
			if (primerArray[j] % 10 == numeroBuscar) {
				aux++;
			}
		}

		segundoArray = new int[aux];

		for (int l = 0; l < primerArray.length; l++) {
			if (primerArray[l] % 10 == numeroBuscar) {
				segundoArray[n] = primerArray[l];
				n++;
			}
		}
		System.out.print("Ahora te voy a mostrar una array con los numeros encontrados: ");
		System.out.println("");
		for (int k = 0; k < segundoArray.length; k++) {
			System.out.print(segundoArray[k] + " ");
		}
		teclado.close();
	}

}
