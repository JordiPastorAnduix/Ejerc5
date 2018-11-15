import java.util.Scanner;
 
public class Practica26 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int opcion = 0;
        int matriz[][] = new int[4][4];
        int filaSumar = 0;
        int contador = 0;
        boolean completado = false;
        boolean exit = false;
        float media = 0.0F;
        int columnaSumar = 0;
 
        Scanner teclado = new Scanner(System.in);
 
        do {
            opcion = 0;
            do {
 
                System.out.println("¿Que quieres hacer con el array?");
 
                System.out.println("1. Rellenar el aray con tus numeros");
                System.out.println("2. Sumar la fila que elijas");
                System.out.println("3. Sumar la columna que elijas");
                System.out.println("4. Suma la diagonal principal");
                System.out.println("5. Suma la diagonal inversa");
                System.out.println("6. Calcula la media de todos los valores");
                System.out.println("7. Salir");
                while (!teclado.hasNextInt()) {
                    System.out.println("Solo funcona con numeros entero");
                    teclado.next();
                }
 
                opcion = teclado.nextInt();
                if (completado == false && opcion == 1) {
                    completado = true;
                }
 
            } while (completado == false);
 
            switch (opcion) {
            case 1:
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        System.out.println("Introduceme el valor para la fila " + i + " en posicion " + j);
                        while (!teclado.hasNextInt()) {
                            System.out.println("Solo funciona con numeros entero");
                            teclado.next();
                        }
                        matriz[i][j] = teclado.nextInt();
                        media = media + matriz[i][j];
                    }
                }
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;
 
            case 2:
                contador = 0;
                System.out.println("¿Que fila desea sumar?");
                do {
                    while (!teclado.hasNextInt()) {
 
                        System.out.println("Solo funciona con numeros entero");
                        teclado.next();
                    }
                    filaSumar = teclado.nextInt();
                } while (filaSumar > matriz.length);
                for (int i = 0; i < matriz.length; i++) {
                    contador = contador + matriz[filaSumar][i];
                }
                System.out.println("El resultado de esa fila es: " + contador);
                break;
 
            case 3:
                contador = 0;
                System.out.println("¿Que columna desea sumar?");
                do {
                    while (!teclado.hasNextInt()) {
                        System.out.println("Solo funcona con numeros entero");
                        teclado.next();
                    }
                    columnaSumar = teclado.nextInt();
                } while (columnaSumar > matriz.length);
 
                for (int i = 0; i < matriz.length; i++) {
                    contador = contador + matriz[i][columnaSumar];
                }
                System.out.println("El resultado de la columna es: " + contador);
                break;
 
            case 4:
                contador = 0;
                for (int i = 0; i < matriz.length; i++) {
                    contador = contador + matriz[i][i];
                }
                System.out.println("La diagonal es: " + contador);
                break;
 
            case 5:
                contador = 0;
                for (int i = 3; i >= 0; i--) {
                    contador = contador + matriz[i][i];
                }
                System.out.println("La diagonal es: " + contador);
                break;
            case 6:
                System.out.println("La media es: " + (media / 16));
                break;
            case 7:
                System.out.println("...Finalizando...");
                exit = true;
                break;
 
            default:
                System.out.println("Opcion no valida");
                break;
            }
 
        } while (!exit);
 
        System.out.println("Gracias!");
        // Recorrer el array para mostrarlo
 
        teclado.close();
    }
 
}
