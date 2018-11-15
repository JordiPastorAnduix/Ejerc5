
public class Practica16 {
	 
    public static void main(String[] args) {
        float media = 0;
        // TODO Auto-generated method stub
        float max = 0;
        
        float floateo = 0;
        String[][] vec =    {{"Espinete", "7.0", "6.8", "3.2", "4.9", "1.6"},
                            {"Don Pinpon","8.0", "2.6", "5.2", "4.4", "3.6"},
                            {"Gustavo", "4.6", "3.0", "7.9", "2.3", "8.3"},
                            {"Triki", "9.6", "1.4", "8.0", "3.2", "7.5"}};
       
        String[][] resultados =     {{"Espinete", "\t", "max"},
                                    {"Don Pinpon", "\t", "max"},
                                    {"Gustavo", "\t", "max"},
                                    {"Triki", "  \t", "max"}};
       
       
        String persona ="";
       
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i][0]+":  \t");
            for (int j = 1; j < vec[i].length; j++) {
                floateo = Float.parseFloat(vec[i][j]);
                media += floateo;
                System.out.print(floateo+"  ");
                if( Float.parseFloat(vec[i][j]) > max) {
                    max = Float.parseFloat(vec[i][j]);
                    persona = vec[i][0];
                }
            }
            System.out.print("||\t");
            System.out.println("La media es: "+media);
            resultados[i][2] = Float.toString(media);
            media = 0;
        }
       
       
       
        System.out.println();
        System.out.println("Nombre \t\t Media");
        System.out.println("----------------------------------------------------");
       
        //media
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.print(resultados[i][j]+" ");
            }
            System.out.println();
        }
       
        System.out.println("----------------------------------------------------");
        System.out.println("El alumno con más nota máxima es: "+persona+" con la nota: "+max);
       
        //el que tenga la media mas alta y la maxima mas alta
       
        System.out.println("La media es: "+ media);
        System.out.println("El alumno con la nota mas alta es: "+persona+" y su media es: "+ media);
       
       
       
    }
 
}


/*
 *




public class Practica16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float media = 0;
		int max = 0;
		
		
		
		
		String[][] arraybidiemnsionalnotas = {	{"Espinete", "6.0", "7.2", "2.3", "5.8" ,"3.4"},
												{"DonPinpon", "7.8", "1.6", "4.6", "9.4", "3.1"}, 
												{"Gustavo", "3.6", "1.4", "8.9", "3.5", "6.5"}, 
												{"Triki", "2.5", "3", "10", "2.4", "8.9"},
												};
		
		String[][] arraynotas = {	{"Espinete", "media", "max"},
									{"DonPinpon", "media", "max"}, 
									{"Gustavo", "media", "max"}, 
									{"Triki", "media", "max"},
									};
		
		
		for (int i = 0; i < arraybidiemnsionalnotas.length; i++) {
			media = 0;
			System.out.print(arraybidiemnsionalnotas[i][0]+":  \t");
			for (int j = 1; j < arraybidiemnsionalnotas[i].length; j++) {
				System.out.print(Float.parseFloat(arraybidiemnsionalnotas[i][j])+" _ ");
				
				media += Float.parseFloat(arraybidiemnsionalnotas[i][j]);
			}
			media = media / ((arraybidiemnsionalnotas.length)-1);
			arraynotas[i][1] = Float.toString(media);
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		
		for (int i = 0; i < arraynotas.length; i++) {
			System.out.print(arraynotas[i][0]+":  \t");
			for (int j = 0; j < arraynotas.length; j++) {
				System.out.print(arraynotas[i][1]+ " _ ");
		
			}
			System.out.println();
		}
		

	}

}

*/
