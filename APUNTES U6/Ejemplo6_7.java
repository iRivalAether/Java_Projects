package U6Ejemplos;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Ejemplo6_7 {

	public static void imprimir(String contenido) {
		String productos[]=contenido.split(",");
		
		System.out.println("ID:"+productos[0]+" Articulo:"+productos[1]+" Precio:"+productos[2]);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena,contenido;
		
		try {
			FileReader archivo = new FileReader("Recibo.txt");
			BufferedReader leer = new BufferedReader(archivo);
			cadena=leer.readLine();
			
			
			while(cadena!=null) {
				contenido = cadena.trim();
				imprimir(contenido);
				cadena=leer.readLine();
				
			}
			archivo.close();
			leer.close();
			
		}catch(IOException e) {
			System.err.println("Error no es posible leer el archivo");
		}
		

	}

}
