
public class EjercicioRepaso1 {

	public static void main(String[] args) {
		EjercicioRepaso1 programa = new EjercicioRepaso1();

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		
		int[] array3 = { 1, 2, 3, 4 };
		int[] array4 = { 1, 2, 3 };
		
		int[] array5 = { 1, 2, 3 };
		int[] array6 = { 1, 2, 2 };
		
		System.out.println(programa.comprobarIguales1(array1, array2));
		System.out.println(programa.comprobarIguales2(array3, array4));
		System.out.println(programa.comprobarIguales3(array5, array6));
	}

	public String comprobarIguales1(int[] array1, int[] array2) {
		boolean igual1 = true;
		String igualesONo1 = "";
		if (array1.length != array2.length) {
			igual1 = false;
			igualesONo1 = "Los arrays no son iguales.";
		}else if (array1.length == array2.length){
			for (int i = 0; i < array1.length && igual1 == true; i++) {
					if (array1[i] == array2[i]) {
						igual1 = true;
						igualesONo1 = "Los arrays si son iguales.";
					} else {
						igual1 = false;
						igualesONo1 = "Los arrays no son iguales.";
					}
			}
		} else {
			igual1 = false;
			igualesONo1 = "Los arrays no son iguales.";
		}
		return igualesONo1;
	}
	
	public String comprobarIguales2(int[] array3, int[] array4) {
		boolean igual2 = true;
		String igualesONo2 = "";
		if (array3.length != array4.length) {
			igual2 = false;
			igualesONo2 = "Los arrays no son iguales.";
		}else if (array3.length == array4.length){
			for (int i = 0; i < array3.length && igual2 == true; i++) {
					if (array3[i] == array4[i]) {
						igual2 = true;
						igualesONo2 = "Los arrays si son iguales.";
					} else {
						igual2 = false;
						igualesONo2 = "Los arrays no son iguales.";
					}
			}
		} else {
			igual2 = false;
			igualesONo2 = "Los arrays no son iguales.";
		}
		return igualesONo2;
	}
	
	public String comprobarIguales3(int[] array5, int[] array6) {
		boolean igual3 = true;
		String igualesONo3 = "";
		if (array5.length != array6.length) {
			igual3 = false;
			igualesONo3 = "Los arrays no son iguales.";
		}else if (array5.length == array6.length){
			for (int i = 0; i < array5.length && igual3 == true; i++) {
					if (array5[i] == array6[i]) {
						igual3 = true;
						igualesONo3 = "Los arrays si son iguales.";
					} else {
						igual3 = false;
						igualesONo3 = "Los arrays no son iguales.";
					}
			}
		} else {
			igual3 = false;
			igualesONo3 = "Los arrays no son iguales.";
		}
		return igualesONo3;
	}
	
}
