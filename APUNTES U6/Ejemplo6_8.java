package U6Ejemplos;
import java.io.*;
public class Ejemplo6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int elemento;
		try {
			FileReader fr = new FileReader("Textos.txt");
			elemento=fr.read();
			
			while(elemento!=-1) {
				System.out.println((char)elemento);
				elemento=fr.read();
			}
			fr.close();
		}catch(IOException e) {
			System.err.println("No se logro leer el archivo");
		}

	}

}
