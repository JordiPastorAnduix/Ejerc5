import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		int numeroA = 0;
		int resultado = 0;
		int i = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escriba el numero del que desea ver la tabla");

		while (!kb.hasNextInt()) {
			System.out.println("Numero incorrecto, indroduzca un entero");
			kb.next();
		}

		numeroA = kb.nextInt();

		while (i <= 10) {
			resultado = numeroA * i;
			System.out.println(numeroA + "x" + i + "=" + resultado);
			i++;

			kb.close();

		}

	}

}
