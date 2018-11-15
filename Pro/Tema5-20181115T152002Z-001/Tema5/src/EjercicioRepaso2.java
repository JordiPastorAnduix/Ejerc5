
public class EjercicioRepaso2 {

	public static void main(String[] args) {
		EjercicioRepaso2 programa = new EjercicioRepaso2();

		int[][] matriz1 = { { 1, 2, 3, 4 }, { 1, 2, 4, 3 }, { 3, 4, 2, 1 } };
		int[][] matriz2 = new int[matriz1[0].length][matriz1.length];
		programa.original(matriz1);
		programa.transpuesta(matriz1, matriz2);
		programa.imprimirMatriz(matriz2);
	}

	public void original(int[][] matriz1) {
		System.out.println("Te voy a imprimir la matriz original: ");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
		}
	}

	public void transpuesta(int[][] matriz1, int [][] matriz2) {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz2[j][i] = matriz1[i][j];
			}
		}
		}
	
	public void imprimirMatriz(int [][] matriz2) {
		System.out.println("\n\nAhora te voy a mostrar la matriz transpuesta: ");
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
		}
	}
	}
