
import java.util.Scanner;

public class Practica6 {
	public static final int kNUM_VALORES = 10;

	public static void main(String[] args) {

		int numValoresLeidos = 0;
		int[] vector1 = new int[kNUM_VALORES];
		int valor = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe " + kNUM_VALORES + " enteros. Puedes hacerlo en diferentes lineas: ");

		while (numValoresLeidos < kNUM_VALORES && valor != -1) {
			if (teclado.hasNextInt()) {
				valor = teclado.nextInt();
				System.out.println("Valor " + numValoresLeidos + " leido: " + valor);
				if (valor != -1) {
					vector1[numValoresLeidos] = valor;
				}
				numValoresLeidos++;
			}else {
				teclado.next();
			}
		}

		System.out.println("Ya se han leido " + numValoresLeidos + " valores");
		for (int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i]);
		}
		teclado.close();
	}

}
