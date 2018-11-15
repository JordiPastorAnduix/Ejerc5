import java.util.Scanner;

public class Practica20 {

	public static void main(String[] args) {
		
		String texto = " ";
		char letra = '\0';

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto: ");
        texto = teclado.nextLine();
        
        System.out.println("Introduce una cadena de texto: ");
        letra = teclado.nextLine().charAt(0);
        teclado.close();
        
        if(texto.indexOf(letra) == -1) {
        	System.out.println("Caracter no encontrado");
        }else {
        	System.out.println("La primera ocurrencia es " + (texto.indexOf(letra) + 1));
        	System.out.println("La ultima ocurrencia es " + (texto.lastIndexOf(letra) + 1));
        }
	}

}
