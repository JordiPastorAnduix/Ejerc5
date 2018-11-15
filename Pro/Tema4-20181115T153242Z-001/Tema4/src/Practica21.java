import java.util.Scanner;

public class Practica21 {

	final static String kPALABRA = "si";

	public static void main(String[] args) {

		String texto = " ";
		boolean probador = false;
		
		Scanner teclado = new Scanner(System.in);
		
		while (probador == false) {
			System.out.println("Adivina la palabra secreta: ");
			texto = teclado.nextLine();
			if (texto.equals(kPALABRA)) {
				System.out.println("Has acertado la palabra!");
				probador = true;
			} else {
				System.out.println("Vuelve a probar");
			}
		}
		teclado.close();
	}
}
