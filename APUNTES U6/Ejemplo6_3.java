package U6Ejemplos;
import java.io.File;
public class Ejemplo6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directorio = new File("Repositorio");
		
		if(directorio.mkdir()) {
			System.out.println("Es un directorio:"+directorio.isDirectory());
			System.out.println("Ruta:"+directorio.getAbsolutePath());
		
		}
		else 
			System.err.println("El directorio ya existe...");

	}

}
