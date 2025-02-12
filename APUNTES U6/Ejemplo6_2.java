package U6Ejemplos;
import java.io.File;
public class Ejemplo6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File archivo= new File("Contenidos.txt");
			if(archivo.createNewFile()) {
				System.out.println("Nombre:"+archivo.getName());
				System.out.println("Ruta Absoluta:"+archivo.getAbsolutePath());
				System.out.println("Tamaño:"+archivo.length());
				System.out.println("Se puede leer:"+archivo.canRead());
				System.out.println("Se puede escribir:"+archivo.canWrite());
			}
			else
				System.err.println("El archivo ya existe");
		}catch(Exception ex){
			System.err.println("Ocurrio un error");
		}

	}

}
