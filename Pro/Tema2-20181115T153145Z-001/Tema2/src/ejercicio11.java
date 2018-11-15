import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		
		double numero1 = 0.0;
		double numero2 = 0.0;
		double numero3 = 0.0;
		double multiplicacion = 0.0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("pon tu primer numero");
		numero1 = teclado.nextDouble();
		System.out.println("pon tu segundo numero");
		numero2 = teclado.nextDouble();
		System.out.println("pon tu tercer numero");
		numero3 = teclado.nextDouble();
		multiplicacion = numero1 * numero2 * numero3;
		System.out.println("El resultado es " + multiplicacion);
		teclado.close();
		
	}

}
