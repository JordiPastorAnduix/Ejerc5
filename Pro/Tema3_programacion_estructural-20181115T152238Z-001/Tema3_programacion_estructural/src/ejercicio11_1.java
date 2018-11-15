import java.util.Scanner;
public class ejercicio11_1 {

	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el intervalo: ");
		while (!teclado.hasNextInt()) {
			System.out.println("No es un numero entero: ");
			teclado.next();
		}
		num = teclado.nextInt();
		
		while(i <= num) {
			suma = suma+i;
			i = i + 3;
		}
		
		System.out.println("La suma es: "+suma);
		
		teclado.close();

	}

}
