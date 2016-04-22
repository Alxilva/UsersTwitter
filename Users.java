import java.io.*;

public class Users{
	 public static void main(String[] args)throws IOException {

	 	BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("\n\t\tBienvenido al programa que busca nicknames de Twitter. \n\t\tPor favor, introduce la ruta del archivo a utilizar:");
	 	String origen = din.readLine();
	 	PrintWriter pout = new PrintWriter(new FileWriter(origen));
	 }
}
