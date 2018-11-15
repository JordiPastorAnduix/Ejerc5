import java.util.Scanner;

public class ejercicio2 {
	static final int kPENALIZACION = 2;
	static final int kMAXPENA = 30;
	static final int kMINIODES = 100;
	static final float kDESCUENTO = 0.1F;

	public static void main(String[] args) {

		float precio = 0.0F;
		float total = 0.0F;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		precio = teclado.nextFloat();
		if (precio >= kMINIODES) {
			total = precio - (precio * kDESCUENTO);
		} else if (precio <= kMAXPENA) {
			total = kPENALIZACION + precio;
		} else {
			total = precio;
		}
		System.out.println("Tendras que pagar" + total + '€');
		teclado.close();

	}

}