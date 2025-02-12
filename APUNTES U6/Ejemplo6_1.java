package U6Ejemplos;
import java.io.File;
public class Ejemplo6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("Texto.txt");
		
		if(archivo.exists()) 
			System.out.println("Existe el archivo");
		else
			System.out.println("No existe el archivo");
		
		
	}

}
