
public class ejercicio21 {
	static final int kSUMA = 4;
	static final int kRESTA = 3;

	public static void main(String[] args) {

		int numero1 = 1;

		System.out.print(numero1 + " ");
		
		while (numero1 < 100) {
			numero1 = numero1 + kSUMA;
			System.out.print(numero1 + " ");
			numero1 = numero1 - kRESTA;
			System.out.print(numero1 + " ");

		}
	}

}