import java.util.Scanner;

public class Practica5 {
	public static final int kNUM_VALORES = 10;

	public static void main(String[] args) {

		int numValoresLeidos = 0;
		int[] vector1 = new int[kNUM_VALORES];
		int valor = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe " + kNUM_VALORES + " enteros. Puedes hacerlo en diferentes lineas: ");

		while (numValoresLeidos < kNUM_VALORES) {

			if (teclado.hasNextInt()) {
				valor = teclado.nextInt();
				System.out.println("Valor " + numValoresLeidos + " leido: " + valor);
				vector1[numValoresLeidos] = valor;
				numValoresLeidos++;
			} else {
				teclado.next();
			}
		}
		System.out.println("Ya se han leido " + kNUM_VALORES + " valores");
		
		for(int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i]);
		}
		teclado.close();
	}

}