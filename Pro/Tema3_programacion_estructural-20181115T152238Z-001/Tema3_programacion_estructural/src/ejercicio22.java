import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {

		int area = 0;
		String figura = "";
		int ladoCuadrado = 0;
		int alturaRectangulo = 0;
		int baseRectangulo = 0;
		int baseTriangulo = 0;
		int alturaTriangulo = 0;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Introduce figura geometrica: ");

			figura = teclado.nextLine();

		} while (!figura.equals("triangulo") && !figura.equals("cuadrado") && !figura.equals("rectangulo"));
		

		if (figura.equals("cuadrado")) {
			System.out.println("Introduce lado del cuadrado: ");
			ladoCuadrado = teclado.nextInt();
			area = ladoCuadrado * 2;
			System.out.print("El area del cuadrado es " + area);
		}

		if (figura.equals("rectangulo")) {
			System.out.print("Introduce altura del rectangulo: ");
			alturaRectangulo = teclado.nextInt();
			System.out.print("Introduce base del rectangulo: ");
			baseRectangulo = teclado.nextInt();
			area = alturaRectangulo * baseRectangulo;
			System.out.print("El area del rectangulo es " + area);
		}

		if (figura.equals("triangulo")) {
			System.out.print("Introduce altura del triangulo: ");
			alturaTriangulo = teclado.nextInt();
			System.out.print("Introduce base del triangulo: ");
			baseTriangulo = teclado.nextInt();
			area = (alturaTriangulo * baseTriangulo) / 2;
			System.out.print("El area del triangulo es " + area);
		}

		teclado.close();
	}

}