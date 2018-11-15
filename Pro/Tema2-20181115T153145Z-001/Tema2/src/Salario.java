import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		String nombre;
		int horas;
		double pagoPorHoras, pagoTotal;

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Como te llamas?");
		nombre = teclado.nextLine();
		System.out.println("¿Cuantas horas trabajastes esta semana?");
		horas = teclado.nextInt();
		System.out.println("¿Cuanto te pagan por hora?");
		pagoPorHoras = teclado.nextDouble();
		pagoTotal = horas * pagoPorHoras;
		System.out.println("Hola " + nombre);
		System.out.println("Tu salario es " + pagoTotal + " €");
		teclado.close();
	}

}
