package U6Ejemplos;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Ejemplo6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		try {
		FileReader archivo = new FileReader("contenidos.txt");
		BufferedReader leer = new BufferedReader(archivo);
		cadena= leer.readLine();
		
		while(cadena!=null) {
			System.out.println(cadena);
			cadena= leer.readLine();
		}
		archivo.close();
		leer.close();
		

		}catch(IOException e) {
			System.out.println("No se logro leer el archivo");
			
		}
	}

}
