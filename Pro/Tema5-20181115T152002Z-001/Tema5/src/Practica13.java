public class Practica13 {

	private static final int[] kARRAY = { 30, 40, 70 };

	public static void main(String[] args) {
		Practica13 programa = new Practica13();
		System.out.println(programa.mayor(kARRAY));
		System.out.println(programa.menor(kARRAY));
		System.out.println(programa.media(kARRAY));
		System.out.println(programa.nota(9));
		System.out.println(programa.mes("febrero"));
		System.out.println(programa.buscar(kARRAY, 70));
	}

	public int mayor(int[] kARRAY) {
		int aux = kARRAY[0];
		for (int i = 0; i < kARRAY.length; i++) {
			if (aux < kARRAY[i]) {
				aux = kARRAY[i];
			}
		}
		return aux;
	}

	public int menor(int[] kARRAY) {
		int aux2 = kARRAY[0];
		for (int i = 0; i < kARRAY.length; i++) {
			if (aux2 > kARRAY[i]) {
				aux2 = kARRAY[i];
			}
		}
		return aux2;
	}

	public int media(int[] kARRAY) {
		int media = 0;
		int suma = 0;
		for (int i = 0; i < kARRAY.length; i++) {
			suma = suma + kARRAY[i];
		}
		media = suma / kARRAY.length;
		return media;
	}

	public String nota(int nota) {
		String notaS = "";
		switch (nota) {
		case 1:
			notaS = "Suspendido";

			break;
		case 2:
			notaS = "Suspendido";

			break;
		case 3:
			notaS = "Suspendido";

			break;
		case 4:
			notaS = "Suspendido";

			break;
		case 5:
			notaS = "Aprobado";

			break;
		case 6:
			notaS = "Aprobado";

			break;
		case 7:
			notaS = "Notable";

			break;
		case 8:
			notaS = "Notable";

			break;
		case 9:
			notaS = "Excelente";

			break;
		case 10:
			notaS = "Excelente";

			break;
		default:
			notaS = "Tiene que ser un numero del 1 al 10";
			break;
		}
		return notaS;
	}

	public int mes(String mes) {

		int meses = 0;
		switch (mes) {
		case "enero":
			meses = 31;

			break;
		case "febrero":
			meses = 29;

			break;
		case "marzo":
			meses = 31;

			break;
		case "abril":
			meses = 30;

			break;
		case "mayo":
			meses = 31;

			break;
		case "junio":
			meses = 30;

			break;
		case "julio":
			meses = 31;

			break;
		case "agosto":
			meses = 31;

			break;
		case "septiembre":
			meses = 30;

			break;
		case "octubre":
			meses = 31;

			break;
		case "noviembre":
			meses = 30;

			break;
		case "diciembre":
			meses = 31;

			break;
		default:
			System.out.print("Escribe bien el mes");
			break;
		}
		return meses;
	}

	public int buscar(int[] kARRAY, int buscar) {
		int respuesta = 0;
		boolean falso = false;
		for (int i = 0; i < kARRAY.length && falso == false; i++) {
			if (kARRAY[i] == buscar) {
				respuesta = i;
				falso = true;
			}
		}
		return respuesta;
	}
}
