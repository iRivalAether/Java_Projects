package U5Ejemplos;
import java.io.*;
public class Ejemplo5_1 {
	
	
	public void captura() throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader cap = new BufferedReader(isr);
		int n=Integer.parseInt(cap.readLine());
	}
	
	public void leer() throws NumberFormatException, IOException {
		captura();
	}

}
