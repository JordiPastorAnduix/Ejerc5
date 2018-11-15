
import java.util.Scanner;

public class Practica23 {

	public static void main(String[] args) {
		
		String frase = " ";
		String [] array1 = null;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una frase: ");
		
		frase = teclado.nextLine();
		array1 = frase.split(" ");
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i].substring(0, 1).toUpperCase() + '.');
		}
			teclado.close();
	}

}
