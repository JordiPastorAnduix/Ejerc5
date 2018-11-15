import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		int dividendo = 0;
		int divisor = 0;
		int cociente = 0;
		int resto = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce dividendo");
		dividendo = teclado.nextInt();
		System.out.print("Introduce divisor");
		divisor = teclado.nextInt();

		cociente = dividendo / divisor;
		resto = (cociente * divisor) - dividendo;

		System.out.print("El resto es " + resto);

		teclado.close();
	}

}
