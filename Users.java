import java.io.*;
import java.lang.*;

public class Users{
	 public static void main(String[] args)throws IOException {
	 	char arroba = '@';
	 	char espacio = ' ';
	 	int i=1;
	 	int lin=1;

	 	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("\n\t\tBienvenido al programa que busca nicknames de Twitter. \n\t\tPor favor, introduce la ruta del archivo a utilizar: \n\t\t");
	 	String origen = leer.readLine();
	 	
	 	BufferedReader  archivo  =  new BufferedReader(new FileReader(origen));
	 	System.out.println("\n\tContenido del archivo:\n");
		String linea = archivo.readLine();
		
		while(linea != null){
			System.out.println(linea);
			linea = archivo.readLine();	
		}

		BufferedReader  archivito  =  new BufferedReader(new FileReader(origen));
	 	System.out.println("\n\tEncontrando nicknames:\n");
		String lino = archivito.readLine();
		
		while(lino != null){
			lin ++;
			System.out.println(lino);
			int identificador = lino.indexOf(arroba);
			
			if (identificador != -1){
				int idenafteruser = lino.indexOf(espacio, identificador);
				System.out.println("\n\tEn la linea " +lin+ " y en la posicion " + lino.indexOf(arroba) + " hay un nickname de usuario.\n");
				System.out.println("\n\t\t"+i+ "." + lino.substring(identificador, idenafteruser+identificador)+"\n");
			}
			
			i++;
		lino = archivito.readLine();
			
		}

	archivo.close();
}
}
