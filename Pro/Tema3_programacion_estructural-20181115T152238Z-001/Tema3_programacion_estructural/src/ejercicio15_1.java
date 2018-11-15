import java.util.Scanner;

public class ejercicio15_1 {
	static final int kSECRETO = 241;

	public static void main(String[] args) {

		int numSolicitado = 0;
		int intentos = 3;
		boolean hasTerminado = false;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Acierta el numero");

		while (hasTerminado == false) {
			while (!sc.hasNextInt()) {
				System.out.println("El numero no es valido");
				sc.next();
			}

			numSolicitado = sc.nextInt();

			if (numSolicitado != kSECRETO) {
				intentos--;
				System.out.println("Tienes " + intentos + " intentos");
			}
			if (intentos == 0) {
				hasTerminado = true;
				System.out.println("Has agotado los intentos");
			}
			if (numSolicitado == kSECRETO) {
				hasTerminado = true;
				System.out.println("Has acertado");
			}
		}
		sc.close();
	}

}
