package U6Ejemplos;
import java.util.Scanner;
public class Ejemplo6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		String cadena;
		System.out.println("Ingresa una cadena:");
		cadena= cap.nextLine();
		Captura almacenar= new Captura(cadena+"\n");
		almacenar.guardar();

	}

}
