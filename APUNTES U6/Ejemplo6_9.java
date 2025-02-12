package U6Ejemplos;
import java.io.*;
public class Ejemplo6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena,contenido;
		
		try {
			FileReader fr = new FileReader("Textos.txt");
			BufferedReader br = new BufferedReader(fr);
			
			PrintWriter pw = new PrintWriter("Factura.txt");
			
			cadena=br.readLine();
			
			while(cadena!=null) {
				contenido=cadena.toLowerCase();
				pw.println(contenido);
				cadena=br.readLine();
			}
			
			fr.close();
			br.close();
			pw.close();
			System.out.println("Operacion existosa...");
		}catch(IOException e) {
			System.out.println("Error al ejecutar operaciones");
		}
		
		
		

	}

}
