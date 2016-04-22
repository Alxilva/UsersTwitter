import java.io.*;
import java.lang.*;

public class Users{
	 public static void main(String[] args)throws IOException {
	 	char arroba = '@';

	 	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("\n\t\tBienvenido al programa que busca nicknames de Twitter. \n\t\tPor favor, introduce la ruta del archivo a utilizar:");
	 	String origen = leer.readLine();
	 	
	 	BufferedReader  archivo  =  new BufferedReader(new FileReader(origen));
	 	System.out.println("\n\tContenido del archivo:\n");
		String linea = archivo.readLine();
		
		while(linea != null){
			System.out.println(linea);
			System.out.println("La posicion es: " + linea.indexOf(arroba));
			linea = archivo.readLine();
			
		}

	archivo.close();
}
}
