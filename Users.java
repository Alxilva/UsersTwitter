import java.io.*;

public class Users{
	 public static void main(String[] args)throws IOException {

	 	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("\n\t\tBienvenido al programa que busca nicknames de Twitter. \n\t\tPor favor, introduce la ruta del archivo a utilizar:");
	 	String origen = leer.readLine();
	 	BufferedReader  archivo  =  new BufferedReader(new FileReader(origen));
	 	System.out.println("Contenido del archivo");
	String linea = archivo.readLine();
	while(linea != null){
		System.out.println(linea);
		linea = archivo.readLine();
	}
	archivo.close();
}
}
