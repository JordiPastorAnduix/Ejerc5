import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		int numeroA = 0;
		int resultado = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escriba el numero del que desea ver la tabla");

		while (!kb.hasNextInt()) {
			System.out.println("Numero incorrecto, indroduzca un entero");
			kb.next();
		}

		numeroA = kb.nextInt();

		for (int i = 0; i <= 10; i++) {
			resultado = numeroA * i;
			System.out.println(numeroA + "x" + i + "=" + resultado);
		}

		kb.close();

	}

}
