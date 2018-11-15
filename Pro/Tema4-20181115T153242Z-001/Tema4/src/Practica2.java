public class Practica2 {

	public static void main(String[] args) {
		
		int [] A = {10, 20, 30, 40, 50};
		int [] B = {50, 60, 70, 80, 100};
		int [] C = new int [5];
		int suma = 0;
		
		suma = A[2] + B[4];
		C[1] = suma + A[0];
	
	System.out.println(suma);
	System.out.println(C[1]);
		
		if (A.length > 5) {
			System.out.println("error");
		}else {
				System.out.println("Esta es la longuitud del vector A " + A.length);
		}
		
	}
}
