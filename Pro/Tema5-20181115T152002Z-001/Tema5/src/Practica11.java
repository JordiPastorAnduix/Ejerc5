
public class Practica11 {

	public static void main(String[] args) {

		Practica11 programa = new Practica11();
		programa.inicio();
	}

	public void inicio() {
		String palabra = "hola";
		System.out.println("antes de llamar al metodo " + palabra);
		modificarParametro(palabra);
		System.out.println("despues de llamar al metodo " + palabra);
	}

	public void modificarParametro(String palabra2) {
		palabra2 = "Adios";

	}

}
