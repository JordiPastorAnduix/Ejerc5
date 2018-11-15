
import java.util.Scanner;

public class Practica17 {

    public static void main(String[] args) {

        String texto = "";
        char letras = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        texto = teclado.nextLine();
        teclado.close();

        System.out.println("------------------------------");
        
        for (int i = texto.length() - 1; i >= 0; i--) {

            letras = texto.charAt(i);
            System.out.print(letras);

        }

    }

}
