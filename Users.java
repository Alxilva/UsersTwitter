import java.io.*;
import java.lang.*;

public class Users{
	 public static void main(String[] args)throws IOException {
	 	char arroba = '@';
	 	char espacio = ' ';

	 	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("\n\t\tBienvenido al programa que busca nicknames de Twitter. \n\t\tPor favor, introduce la ruta del archivo a utilizar:");
	 	String origen = leer.readLine();
	 	
	 	BufferedReader  archivo  =  new BufferedReader(new FileReader(origen));
	 	System.out.println("\n\tContenido del archivo:\n");
		String linea = archivo.readLine();
		
		while(linea != null){
			System.out.println(linea);
			System.out.println("En la posicion " + linea.indexOf(arroba) + " hay un nickname de usuario.");
			int identificador = linea.indexOf(arroba);
			int idenafteruser = substring(identificador).indexOf(espacio);
			System.out.println("1. " + linea.substring(identificador,idenafteruser));
			linea = archivo.readLine();
			
		}

	archivo.close();
}
}
