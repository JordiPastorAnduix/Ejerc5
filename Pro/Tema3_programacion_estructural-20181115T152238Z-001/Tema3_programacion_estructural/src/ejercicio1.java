import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		double precio = 0.0;
		double descuento = 0.0;
		double total = 0.0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		precio = teclado.nextDouble();
		if (precio >= 100) {
			descuento = 0.10 * precio;
		}
		total = precio - descuento;
		System.out.println("Tendras que pagar" + total);
		teclado.close();

	}

}
