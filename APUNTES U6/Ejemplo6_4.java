package U6Ejemplos;
import java.io.*;
public class Ejemplo6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena="1,molletes,70"+"\n"+
		"2,migadas,80"+"\n"+"3,gorditas,90"+"\n";
		
		try {
			FileWriter archivo = new FileWriter("Recibo.txt",true);
			archivo.write(cadena);
			archivo.close();
		}catch(IOException e) {
			System.out.println("Ocurrio un error");
		}
		
		

	}

}
